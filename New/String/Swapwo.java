import java.util.*;
public class Swapwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int f = sc.nextInt();
        System.out.print("Enter 2nd number: \n");
        int s = sc.nextInt();
        f=f+s;
        s=f-s;
        f=f-s;
        System.out.print(" first number: ");
        System.out.print(f);
        System.out.print("\n2nd number: ");
        System.out.print(s);

    }
    
}
