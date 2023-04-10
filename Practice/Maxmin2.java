import java.util.*;
public class Maxmin2
{    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  of elements: ");
        int Row=sc.nextInt();
        int x[] = new int[Row];
        int i;
        for( i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        int iMax = x[0];
       int iMin=x[0];
  
  for(i = 0; i < x.length; i++)
  {
      if(iMax < x[i])        
      {
          iMax = x[i];
      }
        


    }
    System.out.print(" Max element is:"+iMax);

System.out.println();
    for(i=0;i<x.length;i++)
    {
        if(iMin>x[i])
        {
            iMin=x[i];
        }
    }
    System.out.print(" Min element is:"+iMin);

}
}
