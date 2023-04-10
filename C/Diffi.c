#include<stdio.h>
#include<math.h>
 
long long int power(long long int a, long long int b,long long int P)                                     
{ 
    long long int r;
    long long int y=1;
    while(b>0)
    {
        r=b%2;
        if(r==1)
        {
            y=(y*a)%P;
        }
        a=a*a%P;
        b=b/2;
    }

    return y;
}


int main()
{
    long long int P, G, x, a, y, b, ka, kb; 
printf("Enter first prime number\n");
 scanf("%lld",&P);

    printf("Enter second prime number\n");
    scanf("%lld",&G);
   
printf("enter first secret key\n");
scanf("%lld",&a);

    x = power(G, a, P); 
printf("Enter second secret key\n");
scanf("%lld",&b);
    y = power(G, b, P); 

    ka = power(y, a, P); 
    kb = power(x, b, P); 

    printf("Secret key for the Alice is : %lld\n", ka);

    printf("Secret Key for the Bob is : %lld\n", kb);

     

    return 0;
}
 