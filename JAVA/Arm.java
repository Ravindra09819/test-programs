import java.util.*;
class Arm
{
    public static void main(String args[])
    {
Scanner sobj=new Scanner(System.in);
int number=sobj.nextInt();
int icnt=0,rem=0,sum=0;
int temp=number;

while(number>0)
{
    icnt++;
    number=number/10;
}






number=temp;


while(number!=0)
{
int mult=1;
rem=number%10;
for(int i=1;i<=icnt;i++)
{
mult=mult*rem;
}
sum=sum+mult;
number=number/10;

}
if(temp==sum)
{
    System.out.println("Arm is"+sum);
}
else
{

System.out.println(" Armnot number is"+sum);
}
    }
}