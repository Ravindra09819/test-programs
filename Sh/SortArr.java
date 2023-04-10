import java.util.Scanner;


public class SortArr {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        int x[] = new int [n];
        //int max=x[0];
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }


        for(int i=0;i<x.length-1;i++)
        {
            if(x[i]<x[i+1])
            {
                int temp=x[i];
                x[i]=x[i+1];
                x[i+1]=temp;
                 
            }
            
        }
       
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }




    }
    
}