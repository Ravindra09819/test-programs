#include<stdio.h>
#include<string.h>
 void Display( char *str)
 {
    int len=0,temp;
    len=strlen(str);
    for(int i=0;i<len/2;i++)
    {
        temp=str[i];
        str[i]=str[len-i-1];
        str[len-i-1]=temp;
    }
 }
int main()
{
    char str1[40];
    printf("Enter a string: ");
    gets(str1);
    Display(str1);
    printf("Reverse string %s:",str1);
    return 0;
}