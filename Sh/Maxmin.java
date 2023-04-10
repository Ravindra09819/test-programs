import java.util.Scanner;

class Maxmin
{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("how many number ");
    int Row=sc.nextInt();
    int x[]=new int [Row];
    int i;
    for(i=0;i<x.length;i++)
    {
        x[i]=sc.nextInt();
    }
    int iMax=x[0];
    int iMin=x[0];
    for(i=0;i<x.length;i++)
    {
        if(x[i]>iMax)
        {
            iMax=x[i];
        }
        
    }
    for(i=0;i<x.length;i++)
    {
        if(x[i]<iMin)
        {
            iMin=x[i];
        }
        
    }
System.out.println("Max element is"+iMax);
System.out.println("Min element  is"+iMin);

   }
}