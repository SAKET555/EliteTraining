#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j,k,sum=0,found=0,target;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    printf("Enter the target sum: ");
    scanf("%d",&target);
    int *arr = (int*)malloc(n * sizeof(int));
    printf("Enter the elements of the array: ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            if(i==j)
            {
                continue;
            }
            sum +=arr[k];
            if(sum==target)
            {
                        found=1;
                        printf("Subarray with the given sum found from index %d to %d\n",i,j);
                        break;
            }
        }
        sum=0;
    }

    if(found==0)
    {
        printf("No subarray with given sum found\n");
    }
}
    


    

