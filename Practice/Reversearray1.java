import java.util.*;
class Reversearray1
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: " );
        int Row=sc.nextInt();
        int x[]=new int[Row];
        int i;
        for(i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
System.out.print(" Array elements: ");
for(i=0;i<x.length;i++)
        {
           System.out.print(x[i]+" ");
        }
        System.out.print("\n");
        System.out.print("Reverse  Array elements: ");
        for(i=x.length-1;i>=0;i--)
        {
           System.out.print(x[i]+" ");
        }
    }

}