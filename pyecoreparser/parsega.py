from model import print_meta_model_details, print_metamodel_details, print_metamodel_instance
from yamlparser import get_pretty_yaml


def parseTool(tool,metamodel):
    Tool = metamodel.getEClassifier('Tool')
    myTool = Tool()

    myTool.eSet("Name", tool)

    return myTool

def parseWhen(when,metamodel):
    When = metamodel.getEClassifier('When')
    myWhen = When()

    '''push = when.get("push","")

    if push != "":
        myWhen.eSet("Trigger", get_pretty_yaml(push))'''
    
    myWhen.eSet("Trigger", get_pretty_yaml(when))

    return myWhen

def parseEnvironment(environemnt,metamodel):
    Environemnt = metamodel.getEClassifier('Environment')
    
    environemnts = list()

    for currenv in environemnt.items():

        myEnvironemnt = Environemnt()

        myEnvironemnt.eSet("Key", currenv[0])
        myEnvironemnt.eSet("Value", currenv[1])

        environemnts.append(myEnvironemnt)

    return environemnts

def hasif(command):
    return command.get("if","") != ""

def parseIF(ifcomand,metamodel,previous=None):

    ifcondition = ifcomand.get("if","")

    if ifcondition == "":
        return
    
    IfThenElse = metamodel.getEClassifier('IfThenElse')
    myIfThenElse = IfThenElse()
    myIfThenElse.eSet("Condition",  ifcondition)

    myCommand = parseJobCommand(ifcomand,metamodel,previous)

    If = metamodel.getEClassifier('If')
    myIf = If()
    myIf.command.append(myCommand)
    
    myIfThenElse.eSet("true",myIf)

    return (myIfThenElse,myCommand)

def parseJobCommand(command,metamodel,previous=None):
    Commamnd = metamodel.getEClassifier('Command')

    myCommand = Commamnd() 

    name = command.get("name","")

    if name != "":
        myCommand.eSet("Name", name)
    
    def set_tool(tool):
        Tool = metamodel.getEClassifier('Tool')
        myTool = Tool()
        myTool.eSet("Name", tool)

        myCommand.eSet("tool",myTool)

    tool = command.get("uses","")

    if tool != "":
        set_tool(tool)

    if tool == "":
        tool = command.get("run","")
        if tool != "":
            set_tool(tool)

    def set_parameter(parameter):
        Parameter = metamodel.getEClassifier('Parameter')
        myParameter = Parameter()
        myParameter.eSet("Parameter", get_pretty_yaml(parameter))
            
        myCommand.parameter.append(myParameter)

    parameter = command.get("with","")
 
    if parameter != "":
       
        set_parameter(parameter)
 

    if parameter == "":
        parameter = command.get("env","")

        if parameter != "":
            set_parameter(parameter)
    
    if previous != None:
        myCommand.depends.extend([previous])
        print(myCommand.depends)

    print(previous)

    return myCommand

def parseJobCommandsAndIfs(commands,metamodel):
    mycommands = list()
    myifs = list()

    previous = None

    for command in commands:
        if hasif(command):
            myIfThenElse,myCommand = parseIF(command,metamodel,previous)
            myifs.append(myIfThenElse)
            previous = myCommand
        else:
            myCommand = parseJobCommand(command,metamodel,previous)
            mycommands.append(myCommand)
            previous = myCommand


    return (mycommands,myifs)

def parseJobTools(job,metamodel):
    tools = []


    runson = job.get("runs-on","")

    if runson != "":
        Tool = metamodel.getEClassifier('Tool')

        myTool = Tool()

        myTool.eSet("Name", runson)

        tools.append(myTool)
    
    
    strategy = job.get("strategy","")

    if strategy != "":
        Tool = metamodel.getEClassifier('Tool')

        myTool = Tool()

        myTool.eSet("Name", get_pretty_yaml({'strategy': strategy}))

        tools.append(myTool)

    return tools

def parseJob(job,metamodel):
    Job = metamodel.getEClassifier('Job')
    myJob = Job()

    myJob.eSet("Name", job[0])

    content = job[1]

    tools = parseJobTools(content,metamodel)

    for tool in tools:
        myJob.tool.append(tool)

    commands = content.get("steps","")

    if commands != "":
        mycommands,myifs = parseJobCommandsAndIfs(commands,metamodel)
        for mycommand in mycommands:
            myJob.command.append(mycommand)
        for myif in myifs:
            myJob.ifthenelse.append(myif)

    return myJob

def parseJobs(jobs,metamodel):
    myjobs = []
    
    for job in jobs.items():
        myJob = parseJob(job,metamodel)
        myjobs.append(myJob)

    return myjobs

def parsePipeline(yamlfile,metamodel):
    Pipeline = metamodel.getEClassifier('Pipeline')

    myPipeline = Pipeline()
    
    name = yamlfile.get("name","")
    myPipeline.eSet("Name", name)

    when = yamlfile.get(True,"")

    if when != "":
        myWhen = parseWhen(when,metamodel)

        myPipeline.when.append(myWhen)

    environment = yamlfile.get("env","")

    if environment != "":
        environments = parseEnvironment(environment,metamodel)

        for currenv in environments:
            myPipeline.environment.append(currenv)
    
    jobs = yamlfile.get("jobs","")
    
    if jobs != "":
        alljobs = parseJobs(jobs,metamodel)
        for currjob in alljobs:
            myPipeline.job.append(currjob)

    return myPipeline

def parse_github_actions(yamlfile,metamodel):
    metamodel = metamodel.contents[0]

    myPipeline = parsePipeline(yamlfile,metamodel)
    
    print_metamodel_instance(myPipeline)

    return myPipeline
