import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp=n;
        int icnt=0;
        int sum=0;
        while(n>0)
        {
            icnt++;
            n=n/10;

        }
        n=temp;
        while(n!=0)
        {
            int mult=1;
            int rem=n%10;
            for(int i=1;i<=icnt;i++)
            {
                mult=mult*rem;
            }
           
            sum=sum+mult;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("Number is Armstrong: ");
        }
        else
        {
            System.out.print("Number is Not  Armstrong: ");
        }

    }
    
}
