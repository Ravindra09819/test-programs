import java.util.*;
class Even
{


public static void main(String args[])
{
Scanner sobj=new Scanner(System.in);
System.out.println("Enter number:");
int Num=sobj.nextInt();
for(int i=1;i<=Num;i++)
{
    if((i%2)==0)
    {
         System.out.println(i);
}
    }
   
}

}