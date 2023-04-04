import yaml
import sys

def main():
    
    if(len(sys.argv) < 1):
        print("No file given as input")
        return

    try:
        f = open(sys.argv[0], "r")
        docs = yaml.safe_load_all(file)
        print(doc)
    
    except:
        print("Error reading file")
        return

    print("main")



main()
