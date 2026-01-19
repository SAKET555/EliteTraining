#include<stdio.h>
#include<stdlib.h>

int main()
{
    int i,n;
    printf("Enter the number: ");
    scanf("%d",&n);
    printf("The number from 0 to %d are:\n",n);
    int* arr = (int*)malloc(n * sizeof(int));
    for(i=0;i<n;i++)
    {
        scanf("%d\n",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        if(arr[i]==0)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]!=0)
                {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    for(i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }

    return 0;
}