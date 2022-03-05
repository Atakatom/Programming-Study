# link of the problem https://www.hackerrank.com/challenges/find-a-string/problem

def count_substring(string, sub_string):
    i = 0
    count = 0
    while(i < len(string)):
        i = string.find(sub_string,i)
        if(i == -1):
            return count
        i = i + 1 
        count = count + 1
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)