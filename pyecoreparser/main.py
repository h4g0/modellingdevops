from files import copy_random_files, count_files
from model import load_metamodel, save_instance
from parsega import parse_github_actions
from yamlparser import display_yaml_data, get_pretty_yaml, get_yaml_data, pretty_print_yaml, read_yaml


ga_files = "testsga"  # Replace with the path to your folder
metamodel_location = "devops2.ecore"
ga_instances = "gainstances"
ga_validation_instances = "gainstancesvalidaion"


def parse_ga(name,fe,metamodel):
    print(name)

    name = name.replace("yml","xmi")
    metamodel = load_metamodel(metamodel_location)
    instance = parse_github_actions(fe,metamodel)

    ##print_metamodel_instance(instance)

    save_instance(instance,f"{ga_instances}/{name}")

def run_test_file_ga(filename):
    fe = read_yaml(f"{ga_files}/{filename}")
    metamodel = load_metamodel(metamodel_location)
    parse_ga(filename,fe,metamodel)

def run_all_tests():    
    all_yaml_data = get_yaml_data(ga_files)
    metamodel = load_metamodel(metamodel_location)

    for fe in all_yaml_data.items():
        parse_ga(fe[0],fe[1],metamodel)


def main():
    run_all_tests()
    ##copy_random_files(ga_instances,ga_validation_instances,20)
    #print(count_files(ga_instances))
    #print(count_files(ga_validation_instances))
    
main()