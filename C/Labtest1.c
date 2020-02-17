/* Programming test which describes a calculator of volume. Entering values from user input and calculating the values respectively
Author:Markus Baciu
Date:22.10.2018
*/
#include <stdio.h>
#define PI 3.14
int main()
{
    float radius,length,volume1,volume2;
    int num1;
    
    while(num1!=3)
    {
        //display at the start
        printf("\n\nWelcome to the shape volume calculator\n");
        printf("Enter your selection\n1.Radius of sphere\n2.Radius of Cube\n3.None of the above\n");
        scanf("%d",&num1);
        //if statement for radius of sphere
        if(num1 == 1)
        {
            printf("Enter a value of the radius of a sphere\n");
            scanf("%f",&radius);
            
            //volume formula
            volume1 = (4/3)*PI*(radius*radius*radius);
            
            printf("The volume of the sphere is %.2f",volume1);
        }//end if
        if(num1 == 2)
        {
            printf("Enter a value for the length of a cube\n");
            scanf("%f",&length);
           
            //volume formula
            volume2 = length*length*length;
            
            printf("The volume of the cube is %.2f",volume2);
        }//end if
    }//end while
    
    if(num1 == 3)
    {
        printf("You have not selected any of these volumes. Goodbye!");
    }//end if
    
    return 0;
}//end main()





