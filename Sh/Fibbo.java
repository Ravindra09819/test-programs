import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1=0,no2=1,no3;
        System.out.println("Enter the number: ");
          int n=sc.nextInt();
          int sum=0;
          for(int i=1;i<=n;i++)
          {
            no3=no1+no2;
            System.out.print(" "+no3);
            no1=no2;
            no2=no3;
            sum=sum+no3;
          }
          System.out.print("\n");
          System.out.println("Sum is: "+sum);
    }
    
}
