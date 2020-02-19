# Program which allows a user to make pascals triangle by selecting the height and displaying the numbers that follow
# Author:Markus Baciu(C18350801)
# Date:24/10/2019

def make_new_row(old_row,length):

    #prints the old list and creates the new row by appending all the numbers up until the second last element
    for i in range(length):
        print(old_row)
        new_row=[]
        #add old_row[0] to new_row which is always going to be 1
        new_row.append(old_row[0])
        for i in range(len(old_row)-1):
            #adding all the numbers
            new_row.append(old_row[i]+old_row[i+1])
            new_row.append(list[-1])
            #making the new which was just made into the old so that it can continue into the next one
            old_row=new_row


#this function reads the height of the pascal and sends it to make_new row
def height(tall):
    #row always starts at 1
    row = [1]
    #keep doing make_new_row until it has reached the height you have set it for
    for i in range(tall):
        rows = make_new_row(row,tall)
        #print it out
        for j in rows:
            print(j,end="")


#ask the user to enter the height and set the answer to an integer
pascal = int(input("Enter height of Pascal triangle: "))
print(pascal);

