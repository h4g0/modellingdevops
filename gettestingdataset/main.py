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

import json

def save_to_json(data, filename):
    """
    Save Python object to a JSON file.
    
    Args:
        data: Python object to save (dict, list, etc.)
        filename (str): Path to save the JSON file
    """
    try:
        with open(filename, 'w') as f:
            json.dump(data, f, indent=4)
            
    except Exception as e:
        print(f"Error saving to JSON: {str(e)}")

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

    ##get_raw_file("MPLew-is/github-api-client","main","Examples/GithubActionsWebhookClient/ReadMe.md")
    ##get_tool_usage_statistics(myDB)

    ##f = open('Repositories.entreprise_repos.json',encoding="utf8")
    #f = open('Repositories.random-processed.json',encoding="utf8")
    #f = open('travisrepos.json',encoding="utf8")

    ##f = open('Repositories.entreprise_tools_history.json',encoding="utf8")

    repos = json.load(f)
    #repos  = random.choices(repos, k=200)

    print(len(repos))
    #mytools = list(filter( lambda x: ("Travis" in x.get("tools_used",[])) and
    ##                       (len(x.get("tools_used",[])) == 1), repos))
    
    #save_to_json(repos,"travisrepos.json")
    ##print(pretty_json(repos[0]))
    return


main()