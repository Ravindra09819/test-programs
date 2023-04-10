import java.util.*;
public class Dimond {
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
                for(int k=1;k<=(i*2-1);k++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");

            }

            for(int i=n-1;i>0;i--)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
                for(int k=1;k<=(i*2-1);k++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");

            }
        }
    }
    

