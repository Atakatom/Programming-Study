# link of the problem https://www.hackerrank.com/challenges/python-tuples/problem

if __name__ == '__main__':
    n = int(raw_input())
    integer_list = map(int, raw_input().split())
    l = []
    for i in range(n):
        l.append(integer_list[i])        
    print(hash(tuple(l)))