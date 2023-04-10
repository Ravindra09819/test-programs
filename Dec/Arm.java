import java.util.Scanner;

public class Arm 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
         int icnt=0,rem=0,sum=0;
        int temp=n;
        while(n>0)
        {
            icnt++;
            n=n/10;

        }
        n=temp;
        while(n>0)
        {
            int mult=1;
            rem = n%10;
            for(int i=1;i<=icnt;i++)
            {
                mult=mult*rem;
            }
            sum=sum+mult;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("number is Arm");
        }
        else
        {
            System.out.print("number is not Arm");

        }
    }
    
}
