import java.util.*;
public class Prime {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i,j,count;         
        for(  i=2;i<=n;i++)
         {
            count=0;
            for( j=2;j<=i/2;j++)
            {

                if(i%j==0)
                {
                    count=1;
                    break;
                }
            }
                if(count==0)
                {
                    System.out.print(" "+i);
                }

                
            }
            
         }
            }


    

