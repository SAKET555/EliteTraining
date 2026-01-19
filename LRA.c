#include<stdio.h>
#include<stdlib.h>


int Reverse(char array[], int start, int end)
{
    int temp;
    while(start<end)
    {
        temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        start++;
        end--;
    }

    return array[];
}



int main()
{
    int i,j,d;
    int arr[5];
    printf("Value of d: ");
    scanf("%d",&d);

    int temp1[d];
    int temp2[d];
    printf("Enter 5 characters: ");
    for(int i=0;i<5;i++)
    {
        scanf("%c",&arr[i]);
    }

    for(i=0;i<d;i++)
    {
        temp1[i]=arr[i];
    }

    for(i=d;i<5;i++)
    {
        temp2[i-d]=arr[i];
    }

    Reverse(temp1,0,d-1);
    Reverse(temp2,0,5-d-1);


    for(i=0;i<d;i++)
    {
        arr[i]=temp1[i];
    }

    for(i=d,j=0;i<5;i++,j++)
    {
        arr[i]=temp2[j];
    }


    for(i=0;i<5;i++)
    {
        printf("The answer is : %d ",arr[i]);
    }

    return 0;
}