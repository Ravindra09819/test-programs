import java.util.*;
class UST{
    public static void main(String args[])
    {
Scanner sobj=new Scanner(System.in);
System.out.print("Enter number");
int n=sobj.nextInt();
int x[]=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
    x[i]=sobj.nextInt();
}

//System.out.println("Enter below values");
for(int i=0;i<=1;i++)
{
//System.out.println(x[i]);
    sum=sum+x[i];
}
System.out.println(":"+sum);
    }
}
