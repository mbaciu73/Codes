/* Program used to operate an ATM
for a bank
*/
#include <stdio.h>
#define PIN 1234

int main()
{
    //
    int operation;
    int pin = PIN;
    int pin2;
    int correct =0;
    int incorrect = 0;
    
    do
    {
        //The menu
        printf("\n\nWelcome to the ATM");
        printf("\nChoose one of the following");
        printf("\n1.Enter Pin and verify correct");
        printf("\n2.Change Pin");
        printf("\n3.Display the number of times the pin was entered i)correctly ii)incorrectly");
        printf("\n4.Exit program\n");
        scanf("%d",&operation);
        
        
        if(operation == 1)
        
        {
            printf("\nEnter your pin\n");
            scanf("%d",&pin2);
            
            if(pin2 == pin)
            {
                printf("\nYour pin is correct");
                correct++;
            }//end if
            else
            {
                printf("Your pin is incorrect");
                incorrect++;
            }//end else
            
        }//end if(operation =1)
        
        if(operation == 2)
        {
            printf("\nEnter a new pin\n");
            scanf("%d",&pin2);
            
            if(pin<1000||pin>9999)
            {
                printf("Must be a number of 4 digits\n");
            }//end if
            else
            {
                printf("Verify your pin\n");
                scanf("%d",&pin);
                if(pin2 == pin)
                {
                    printf("\nYou have changed your pin successfully");
                }//end if
                else
                {
                    pin = PIN;
                    printf("Verification incorrect your password has not changed");
                }//end inner else
            }//end outer else
        }//end if(operation = 2)
        
        if(operation ==3)
        {
            printf("\n Your pin has been entered %d time(s) correctly",correct);
            printf("\n Your pin has been entered %d time(s) incorrectly",incorrect);
        }
    }
    while(operation !=4);

    
    

    return 0;
}



