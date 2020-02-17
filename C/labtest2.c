#include <stdio.h>
#define SIZE 5
int main()
{
    int array[SIZE][SIZE];
    int i,j;
    int sum=0;
    int count_0=0;
    int count_1=0;
    int count_2=0;
    int count_3=0;

    //part a initialise array to contain 5
    for(i=0; i<SIZE; i++)
    {
        for(j=0; j<SIZE; j++)
        {
            array[i][j] = 5;
        }//end for(j=0)
    }//end for(i=0)

    //part b initialise diagonals to 1
    for(i=0; i<SIZE; i++)
    {
        for(j=0; j<SIZE; j++)
        {
            if(i==j)
            {
                array[i][j]=0;
            }
            sum=i+j;
            if(sum == (SIZE-1))
            {
                array[i][j]=0;
            }
        }
    }
    //part c initialise middle row and middle column to 1
    for(i=0; i<SIZE; i++)
    {
        for(j=0; j<SIZE; j++)
        {
            if(i==2||j==2)
            {
                array[i][j]=1;
            }
        }
    }
    //part d initialise corners to 2
    for(i=0; i<SIZE; i++)
    {
        for(j=0; j<SIZE; j++)
        {
            if(i==0&&j==0||i==0&&j==4||i==4&&j==0||i==4&&j==0)
            {
                array[i][j]=2;
            }
        }
    }
    //part e count the amount of each number in the array
    for(i=0; i<SIZE; i++)
    {
        for(j=0; j<SIZE; j++)
        {
            if(array[i][j]==0)
            {
                count_0++;
            }
            if(array[i][j]==1)
            {
                count_1++;
            }
            if(array[i][j]==2)
            {
                count_2++;
            }
            if(array[i][j]==5)
            {
                count_3++;
            }
        }
    }

    printf("Number 0 is in the array %d amount of times\n",count_0);
    printf("Number 1 is in the array %d amount of times\n",count_1);
    printf("Number 2 is in the array %d amount of times\n",count_2);
    printf("Number 5 is in the array %d amount of times",count_3);

}
