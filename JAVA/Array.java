import java.util.*;
class Array
{
public static void main(String args[])
{
Scanner sobj=new Scanner(System.in);
    int size,sum=0;
    System.out.println("Enter size of Array:");
    size=sobj.nextInt();
    int x[]=new int [size];
      System.out.println("Enter "+size+ " elements:");
    for(int i=0;i<size;i++)
    {
        x[i]=sobj.nextInt();
    }

    System.out.println("Enter below values:"+size);
    for(int i=0;i<size;i++)
    {
        System.out.println(x[i]);
        sum=sum+x[i];
    }
    System.out.println("Sum is"+sum);
}

}