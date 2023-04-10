import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int f = sc.nextInt();
        System.out.print("Enter a 2nd number ");
        int s = sc.nextInt();
        int temp=f;
        f=s;
        s=temp;
        System.out.print(" first number is: ");
        System.out.print(f);
        System.out.print(" \n 2nd number is ");
        System.out.print(s);
    }
    
}
