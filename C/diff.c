#include<stdio.h>
#include<math.h>
 
long long int power(long long int g, long long int b,long long int N)
                                   
{ 

    long long int r;
    long long int y=1;
    while(b>0)
    {
        r=b%2;
        if(r==1)
        {
            y=(y*g)%N;
        }
        g=g*g%N;
        b=b/2;

    }

    return y;
}

int prime(long long int no)
{
    int i;
    for(i=2;i<=no/2;i++)
    {
        if(no%i==0)
        {
            return 0;
        }
    }
    return 1;
}


int main()
{

    long long int P, G, x, a, y, b, ka, kb; 

   printf("Enter first prime number\n");
    scanf("%lld",&P); 
    int result = prime(P);
    if(result==1)
    {
        printf("The value of P : %lld\n", P); 
    }
    else
    {
        printf("This is not prime number please enter prime number:");
        scanf("%lld",&P);
    }

    
    printf("Enter second prime number\n");
    scanf("%lld",&G);
    int result1=prime(G);
    if(result1==1)
    {
        printf("The value of G : %lld\n", G); 
    }
    else
    {
        printf("This is not prime number please enter prime number:");
        scanf("%lld",&G);
    }
    
    printf("The value of G : %lld\n\n", G); 

   printf("enter first secret key\n");
    scanf("%lld",&a);
    if(a<0)
    {
        printf("please enter positive key value for Alice:");
        scanf("%lld",&a);
    }
    printf("The private key a for Alice : %lld\n", a);
    x = power(G, a, P); // x=G^a mod P

    printf("Enter second secret key\n");
    scanf("%lld",&b);
    if(b<0)
    {
        printf("please enter positive key value for Bob:");
        scanf("%lld",&b);
    }
    printf("The private key b for Bob : %lld\n\n", b);
    y = power(G, b, P); 
    ka = power(y, a, P);    
    kb = power(x, b, P);    

    printf("Secret key for the Alice is : %lld\n", ka);
    printf("Secret Key for the Bob is : %lld\n", kb);

    return 0;
}