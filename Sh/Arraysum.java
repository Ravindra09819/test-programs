import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number: ");
        int n=sc.nextInt();
        int x[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           sum=sum+x[i];
        }
        System.out.print(" sum is: "+sum);
    }
    
}
