##############
#This program is created for the diophantine program to distinguish if 2 values after they have found the
# GCD will it divide evenly into the value assigned at the end
#Author: Markus Baciu
################
# this function is used to distinguish the gcd between the 2 number entered by the user
#if the y variable has no more remainders then the gcd is then it returns x.
#it will keep recursing until y is equal to zero
def gcd(x,y):
    if(y == 0):
        return x
    else:
        return gcd(y,x%y)
#this function is to check if the gcd leaves no remainder when divided into the assigned value
def possible(a,b,c):
    hcf = gcd(a,b)
    if c%hcf==0:
        return True
    else:
        return False


def diophantine():
    #in case an integer is not entered it will keep asking the user to enter a integer until all 3 values are entered
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

    #these will send them to the display finction respectively
    if possible(x,y,equal):
        display(x,y,equal)
    else:
        display2(x,y,equal)
#if there is a possible solution
def display(x,y,equal):
    print("{}x + {}y = {}".format(x,y,equal))
#if there is not possible solution
def display2(x,y,equal):
    print("{}x + {}y ≠ {}".format(x,y,equal))

#intro print will then send to the diophantine function
print("Welcome to the diophantine equation calculator. Where you can see after entering the values, you will be able to see if they create a solution or not")
diophantine()