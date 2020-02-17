/*Program used to encrypt codes. An array names access_code is the code needed for successfully encrypting the code 1234 into the access_code
4523. After a do while loop is done to ensure the menu is always shown until the user enters number 5 which exits the program. When the user
selects the number the number then enters the switch and selects the number case relevant to the choice. After entering the choice, Each case enters
into their specific function which either allows the user to enter the code,encrypt the code encrypt the code and display the amount of times
the code has been entered successfully.
Author:Markus Baciu(C18350801)
Date:07.03.2019
*/
#include <stdio.h>
#define SIZE 4
//function prototypes of the program
int option_1(int*);
int option_2(int*,int*,int*);
int option_3(int*);
int option_4(int*,int*);
void option_5();
int main()
{
    int selection;
    int code[SIZE];
    int access_code[SIZE]={4,5,2,3};
    int *correct=0;
    int *incorrect=0;

    do
    {
        //the menu
        printf("\n\nPlease choose from one of the following options\n");
        printf("Press 1 to Enter Code\n");
        printf("Press 2 to Encrypt code and verify correct\n");
        printf("Press 3 to decrypt the code\n");
        printf("Press 4 to display the number of times to code was entered correctly or incorrectly\n");
        printf("Press 5 to exit\n");
        scanf("%d",&selection);

        //a switch is done in order to take the number from the menu and implemented here
        switch(selection)
        {
            case 1:
            {
                option_1(&code);
                break;
            }
            case 2:
            {
                option_2(&code,&correct,&incorrect);
                break;
            }
            case 3:
            {
                option_3(&code);
                break;
            }
            case 4:
            {
                option_4(&correct,&incorrect);
                break;
            }
            case 5:
            {
                option_5();
                break;
            }
        }
    }
    while(selection!=5);

    return 0;
}
int option_1(int *code_entered)
{
    int i;
    //enter the code and saving into an array named code_entered
    printf("Enter your code one number at a time\n");
    //for loop to scan the numbers entered by the user
    for(i=0;i<SIZE;i++)
    {
        scanf("%d",&*(code_entered+i));
    }
    for(i=0;i<SIZE;i++)
    {
        //if a number that has 2 digits is entered the error message is displayed
        if(*(code_entered+i)>=10)
        {
            printf("\nNumbers must be between 0 and 9");
        }
    }

}
int option_2(int*code_entered,int*correct,int*incorrect)
{
    int i;
    int temporary;
    static int right;
    int access_code[SIZE]={4,5,2,3};
    //the encryption starting with the swapping of the numbers
    temporary=*(code_entered+1);
    *(code_entered+1)=*(code_entered+3);
    *(code_entered+3)=temporary;

    temporary=*(code_entered+2);
    *(code_entered+2)=*(code_entered+4);
    *(code_entered+4)=temporary;
    //incrementing the numbers entered by the user
    for(i=0;i<SIZE;i++)
    {
        *(code_entered+i)=*(code_entered+i)+1;
    }
    //this changes the number to 0 if after the incrementing for loop above is equal to 10
    for(i=0;i<SIZE;i++)
    {
        if(*(code_entered+i)==10)
        {
            *(code_entered+i)=0;
        }//end if()
    }
    //this allows for the number element in each array is equal to the access_code array. it increments the integer right.
    for(i=0;i<SIZE;i++)
    {
        if(*(code_entered+i)=*(access_code+i))
        {
            right++;
        }
        else
        {
            right=0;
        }

    }
    //if the code is encrypted in the same code as access_code right must equal to 4. If not the code is not encrypted correctly.
    if(right==4)
    {
        printf("The codes match and you have successfully encrypted the code!");
        correct++;
    }
    else
    {
        printf("The codes do not match and you have not encrypted the code successfully!");
        incorrect++;
    }

}
int option_3(int *code)
{
    int temp;
    int i;
    //the decryption is the same as the encryption but backwards
    temp=*(code+3);
    *(code+3)=*(code+1);
    *(code+1)=temp;

    temp=*(code+4);
    *(code+4)=*(code+2);
    *(code+2)=temp;
    //decrements each element by 1
    for(i=0;i<SIZE;i++)
    {
       *(code+i)=*(code+i)-1;
    }
    //if the number in the element of the array is -1 the element changes to 9
    for(i=0;i<SIZE;i++)
    {
        if(*(code+i)==-1)
        {
            *(code+i)=9;
        }
    }
    //printing out the code that was entered by the user.
    printf("The code you entered is: ");
    for(i=0;i<SIZE;i++)
    {
        printf("%1d",*(code+i));
    }
}
//showing how many times the code has been entered successfully or not
int option_4(int*correct,int*incorrect)
{
    printf("The code has been entered correctly %d time(s)\n",*correct);
    printf("The code has been entered incorrectly %d time(s)",*incorrect);

}
//exiting the program smoothly with this function.
void option_5()
{
    printf("You have exited the program. Goodbye");
}

