import java.util.*;
class Fibbo
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sobj.nextInt();
int no1=0;
int no2=1;
int no3=0;
int sum=0;
for(int i=1;i<=n;i++)
{
    no3=no1+no2;
    System.out.println(no3);
    sum=sum+no3;
no1=no2;;
no2=no3;
}
System.out.println("Sum is"+sum);



    }
}