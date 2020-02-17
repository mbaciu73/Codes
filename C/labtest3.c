/* Program used to enter a set of 5 temperatures into a floating point array. Then a fucntion is written that accepts 1 parameter and
return a floating number in fahrenheit. Make a function to contain the celcius temperatures and display them beside the celcuis figure.
it then calculates the average and return the value to the main. do the same idea aswell but in kelvin. it then displays the average of
the temperature in kelvin.

Author:Markus Baciu(C18350801)

Date:21.02.2019
*/
#include <stdio.h>
#define SIZE 5
//declaring prototype
float convert_temp(float[]);
float in_kelvin(float[]);
int main()
{
    //declaring variables
    float average_celcius;
    float average_kelvin;
    int i;
    float temperatures[SIZE];
    //printing the menu
    printf("Enter your 5 temperatures: ");
    //scanning the number each time in the loop
    for(i=0;i<SIZE;i++)
    {
        scanf("%f",&temperatures[i]);
    }//end for

    //setting the average_celcius to the function convert_temp
    average_celcius=convert_temp(temperatures);

    printf("The average temperature in celcius is %.2f",average_celcius);
    //setting the average_kelvin to the function in_kelvin
    average_kelvin=in_kelvin(temperatures);

    printf("The average temperature in kelvin is %.2f",average_kelvin);

    return 0;

}
float convert_temp(float celcius[])
{
    int i;
    int j;
    static float sum;
    float average_temp;
    float fahrenheit[SIZE];
    //setting a loop for converting the temperature into fahrenheit using the formula
    for(i=0;i<SIZE;i++)
    {
        fahrenheit[i]=((celcius[i]*9)/5)+32;
    }
    //printing out the celcius and the fahrenheit figure together
    for(i=0;i<SIZE;i++)
    {
        printf("\nThe celcius temperature %.3f in fahernheit is: %.3f\n",celcius[i],fahrenheit[i]);
    }//end for
    //setting the sum of the celcius figure needed for the average
    for(j=0;j<SIZE;j++)
    {
       sum=sum+celcius[j];
    }//end for
    //the average formula
    average_temp=sum/5;
    //this returns the average value into the main()
    return average_temp;

}
float in_kelvin(float celcius[])
{
    int i;
    int j;
    float sum;
    float average_temp1;
    float kelvin[SIZE];
    //setting a loop for converting the temperature into kelvin using the formula
    for(i=0;i<SIZE;i++)
    {
        kelvin[i]=celcius[i]+273;
    }
    //adding all the temperatures together for the average
    for(j=0;j<SIZE;j++)
    {
       sum=sum+kelvin[j];
    }
    average_temp1=sum/5;
    //return the average to main()
    return average_temp1;
}

