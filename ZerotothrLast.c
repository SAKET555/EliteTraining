#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i,n,count=0;
    printf("Enter the number: ");
    scanf("%d",&n);
    printf("The number from 0 to %d are:\n",n);
    int* arr = (int*)malloc(n * sizeof(int));
    for(i=0;i<n;i++)
    {
        scanf("%d\n",&arr[i]);
    }
    //yes



    for(i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            count++;
        }

        else if(arr[i]==0)
        {
            while(arr[i]==0 && i<n)
            {
                i++;
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
        }
    }

    //yes
    for(i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }

    return 0;
}