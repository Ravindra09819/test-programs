import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\n");
        int ino = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=ino;j++)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }

    }
    
}
