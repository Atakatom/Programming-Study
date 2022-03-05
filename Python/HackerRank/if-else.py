#link of the problem https://www.hackerrank.com/challenges/py-if-else/problem

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if(n%2==0):
        if(n>20 or (n<=5 & n>=2)):
            print("Not ",end="")
    print("Weird")