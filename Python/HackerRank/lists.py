# link of the problem https://www.hackerrank.com/challenges/python-lists/problem

if __name__ == '__main__':
    N = int(input())
    l = []
    for i in range(N):
        str = input().split(" ")
        if(str[0] == "print"):
            print(l)
        elif(str[0] == "insert"):
            l.insert(int(str[1]),int(str[2]))
        elif(str[0] == "append"):
            l.append(int(str[1]))
        elif(str[0] == "remove"):
            l.remove(int(str[1]))
        elif(str[0] == "pop"):
            l.pop()
        elif(str[0] == "sort"):
            l.sort()
        else:
            l.reverse()