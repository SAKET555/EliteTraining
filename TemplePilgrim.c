// #include<stdio.h>
// #include<stdlib.h>

// int main() {
//     int n=10,k=50, amount = 0;

//     for(int i=0;i<n;i++)
//     {
//         amount = (amount + k)/2;
//     }

//     printf("%d\n",amount);
//     return 0;
// }

#include<stdio.h>
#include<stdlib.h>

int main() {
    float n=4,k=100,initial = 1200;

    for(int i=0;i<n;i++)
    {
        
        initial = (initial + 100)/2;
    }

    printf("%f\n",initial);
    return 0;
}