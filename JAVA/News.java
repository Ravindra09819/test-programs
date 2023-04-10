import java.util.*;
class News
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number:\n");
        int n=sobj.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sobj.nextInt();
            
        }
        for(int i=2;i<n;i++)
        {
            System.out.print(x[i]);
        }
        
        for(int i=0;i<=1;i++)
        {
            System.out.print(x[i]);
        }
        


    }
}