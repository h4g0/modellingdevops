from model import load_metamodel, save_instance
from parsega import parse_github_actions
from yamlparser import display_yaml_data, get_pretty_yaml, get_yaml_data, pretty_print_yaml


ga_files = "testsga"  # Replace with the path to your folder
metamodel_location = "devops2.ecore"
ga_instances = "gainstances"

def main():

    
    all_yaml_data = get_yaml_data(ga_files)

    fe = list(all_yaml_data.items())[0]
    name = fe[0].replace("yml","xmi")
    fe = fe[1]
    ##pretty_print_yaml(fe)
    #for i in fe.items():
    #    print(i)

    print(fe)
    print(fe[True])

    #for i in fe["jobs"].items():
    #    print(i)

    metamodel = load_metamodel(metamodel_location)
    instance = parse_github_actions(fe,metamodel)
    ##display_yaml_data(all_yaml_data)
    save_instance(instance,f"{ga_instances}/{name}")
    ##pretty_print_yaml(fe[True]['push'])
main()