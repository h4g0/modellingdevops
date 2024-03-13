import requests 
import json
import time
from requests.structures import CaseInsensitiveDict
from api import change_token, get_content_repositories, get_multiple_random_repositories, get_rate_limit, get_raw_file
from db import DB
from stats import get_cicd_percent_per_year, get_language_number_of_tools_distribution, get_languages_cicd, get_languages_more_than_one_percent, get_map_tool_tool, get_number_of_tools_distribution, get_number_tools_per_year, get_programming_languages, get_programming_languages_all, get_programming_languages_repos, get_stats_repos_per_tool, get_tools_language_cicd, get_tools_more_than_one_percent
from tools import find_repos_tools, get_all_random_repositories_dates, get_ga_files, get_repos_data_dates, get_total_repos_per_tool
from transform_data import reduce_repositories
from multiprocessing import Pool
from keys import key,keyhugo2,keyhugo3,keyjacome
import random

def pretty_json(item):
    print(json.dumps(item, indent=2))

def add_multiple_repositories_to_db(myDB,pages,stars=20):
    
    
    repositories = reduce_repositories(get_multiple_random_repositories(pages,stars))

    myDB.add_repositories(repositories)
        
    print(len(repositories))

def get_tool_usage_statistics(myDB):
    
    repos = myDB.get_processed_repositories()

    print(len(repos))

    print(get_total_repos_per_tool(repos))

def process_repositories(myDB,count):
        
    repos = myDB.get_random_unprocessed_repositorioes(count)
    
    find_repos_tools(myDB,repos)

def test_time_per_repo(myDB,number_of_repos):
    start = time.time()

    process_repositories(myDB,number_of_repos)

    total_time = time.time() - start

    print(f"total time {total_time}: time per repo: {total_time / number_of_repos}")

def process_repos_keys(myDB,count):
    
    onehour = (60 * 60)

    keys = [key,keyhugo2,keyhugo3,keyjacome]

    timeperkey = int(onehour / len(keys))

    print(timeperkey / 60)
    
    for k in keys:

        change_token(k)

        start = time.time()

        process_repositories(myDB,count)
        
        times = int(time.time() - start)
        
        sleeping_time = timeperkey - times

        if sleeping_time < 0:
            continue

        print(f"sleeping for {sleeping_time} seconds")

        time.sleep(sleeping_time)
<<<<<<< HEAD

def remove_tools(repos):

    forbidden = ["Jenkins","JenkinsX","GitLab","GitHubActions","Travis"]
    
    def contains_forbidden(repo):
            
        for snapshot in repo["snapshots"]:
            for tool in snapshot["tools"]:
                if tool in forbidden:
                    return True
        return False
    
    new_repos = []

    for repo in repos:
        if (not contains_forbidden(repo)):
            new_repos.append(repo)
    
    return new_repos


def get_transitions(repos):
    
    new_repos = []
    
    def contains_transition(repo):
        tools = []

        for snapshot in repo["snapshots"]:
            

            for tool in snapshot["tools"]:
                if len(tools) > 0 and (not (tool in tools)):
                    return True
            
            tools = snapshot["tools"]

        return False
    
    for repo in repos:
        if contains_transition(repo):
            new_repos.append(repo)
    
    return new_repos

def main():
    
    ##myDB = DB()
=======
        
def main():
    
    myDB = DB()
>>>>>>> eab672af45a6f2fe7d086f612506ab0553740043

    ##get_raw_file("MPLew-is/github-api-client","main","Examples/GithubActionsWebhookClient/ReadMe.md")
    ##get_tool_usage_statistics(myDB)

<<<<<<< HEAD
    f = open('Repositories.repo_tools_history.json')

    repos = json.load(f)

    print(pretty_json(repos[0]))
    print(len(repos))
    new_repos = get_transitions(remove_tools(repos))
    print(len(remove_tools(repos)))
    print(len(new_repos))
    json_object = json.dumps(new_repos, indent=4)
    
    # Writing to sample.json
    with open("transactions.json", "w") as outfile:
        outfile.write(json_object)
    """repos = myDB.get_random_processed_repositories_with_tool(1000,"GitHubActions")
=======
   

    ##repos = myDB.get_random_processed_repositories(10000)

    repos = myDB.get_random_processed_repositories_with_tool(1000,"GitHubActions")
>>>>>>> eab672af45a6f2fe7d086f612506ab0553740043

    random.shuffle(repos)

    sample = repos[0:200]

    ga_samples = get_ga_files(sample)
    
    print(len(ga_samples))
    ##print(get_map_tool_tool(repos))

    print(ga_samples[1])

    count = 0
    for r in ga_samples:
        try:
            f = open(f"tests2/test{count}.mydsl11", "w")
            f.write(r)
            f.close()
            count+=1
        except: 
            count += 1
<<<<<<< HEAD
    repos_filename = [("Agola","\.agola"),
=======
    """repos_filename = [("Agola","\.agola"),
>>>>>>> eab672af45a6f2fe7d086f612506ab0553740043
                    ("AppVeyor","appveyor\.yml"),
                    ("ArgoCD","argo\-cd"),
                    ("Bytebase","air\.toml"),
                    ("Cartographer","cartographer\.yaml"),
                    ("CircleCI","circleci"),
                    ("Cloud 66 Skycap","cloud66"),
                    ("Cloudbees Codeship","codeship\-services\.yml"),
                    ("Devtron","devtron\-ci\.yaml"),
                    ("Flipt","flipt\.yml"),
                    ("GitLab","gitlab\-ci\.yml"),
                    ("Google Cloud Build","cloudbuild\.yaml"),
                    ("Helmwave","helmwave\.yml"),
                    ("Travis","\.travis\.yml"),
                    ("Jenkins","Jenkinsfile"),
                    ("JenkinsX","jx\-requirements\.yml"),
                    ("Keptn","charts\/keptn\/"),
                    ("Liquibase","liquibase\.properties"),
                    ("Mergify","mergify"),
                    ("OctopusDeploy"," \.octopus"),
                    ("OpenKruise","charts\/kruise\/"),
                    ("OpsMx","charts\/isdargo\/"),
                    ("Ortelius","component\.toml"),
                    ("Screwdriver","screwdriver\.yaml"),
                    ("Semaphore","\.semaphore\/semaphore\.yaml"),
                    ("TeamCity","\.teamcity"),
                    ("werf","werf\.yaml"),
                    ("Woodpecker CI", "\.woodpecker\.yml"),
                    ("GitHubActions","github\/workflows")]

    repos_code_yml = [("Codefresh","DaemonSet"),
                    ("XL Deploy","apiVersion\: \(xl-deploy\|xl\)"),
                    ("Drone","kind\:"),
                    ("Flagger","flagger"),
                    ("Harness.io","featureFlags\:"),
                    ("Flux","fluxcd"),
                    ("GoCD","stages\:"),
                    ("Concourse","resources\:"),
                    ("Kubernetes","apiVersion\:"),
                    ("AWS CodePipeline","roleArn"),
                    ]


    repos = []

    repos.extend(repos_filename)
    repos.extend(repos_code_yml)

    print(len(repos))

    for i in range(0,len(repos),2):
        print(f"{repos[i][0]} & {repos[i+1][0]}\\\\")
        print("\hline")"""

    """f = open('Repositories.random-processed.json',encoding="utf8")

    data = json.load(f)

    count = 0

    for repo in data:
        tools = len(repo.get("tools_used",[]))

        if(tools > 1):
            count += 1
    
    print(count)"""
    """data = list(filter(lambda x: len(x["tools_used"]) > 0, data))
    print(get_language_number_of_tools_distribution(data))"""

    ##print(get_stats_repos_per_tool(repos))    
    ##get_rate_limit()
    ##process_repos_keys(myDB,20)
    """while True:
        process_repos_keys(myDB,5000)"""
    ##test_time_per_repo(myDB,1000)

    ##add_multiple_repositories_to_db(myDB,2,10)
    ##get_tool_usage_statistics(myDB)
    
    ##get_repos_data_dates(myDB,"08/04/10","23/10/15")

    """start = time.time()

    rr = get_repos_data_dates(myDB,"12/01/01","16/12/31",10)
    
    print( time.time() - start )"""
    
    """rr = [x["stargazers_count"]for x in get_all_random_repositories_dates("2023-10-08","2023-10-15")]

    print(rr)

    ur = set()

    for r in rr:
        ur.add(r)

    print(len(ur))"""

    """start = time.time()

    await process_repositories(myDB)

    print( time.time() - start )"""


main()