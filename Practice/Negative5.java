import java.util.*;
public class Negative5 {
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");
        int Row=sc.nextInt();
        int x[]=new int[Row];
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }

        for(int i=0;i<x.length;i++)
        {
           if(x[i]<0)
           {
            
            System.out.print(x[i]+" ");
           }
           else 
           { 
           
            System.out.print(x[i]+" ");
           }
           
        }
    }
    
}
