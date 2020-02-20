##############
#This program is created for the diophantine program to distinguish if 2 values after they have found the GCD will it divide evenly into the value assigned at the end
#Author: Markus Baciu
from math import gcd

def possible(a,b,c):
    if c%gcd(a,b)==0:
        return True
    else:
        return False


def diophantine():
    try:
        print("Enter the x value:")
        x=int(input())
        print("Enter the y value:")
        y=int(input())
        print("Enter the equals value:")
        equal= int(input())
    except:
        print("Please try again")
        diophantine()


    if possible(x,y,equal):
        display(x,y,equal)
    else:
        display2(x,y,equal)

def display(x,y,equal):
    print("{}x + {}y equals to {}".format(x,y,equal))

def display2(x,y,equal):
    print("{}x + {}y does not equal to {}".format(x,y,equal))


print("Welcome to the diophantine equation calculator")
diophantine()