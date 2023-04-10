import java.util.*;
public class Odd {
    public static void main(String[] args) {
        System.out.print("How many number\n ");
        Scanner sc = new Scanner(System.in);
        int ino=sc.nextInt();
        for(int i=1;i<=ino;i++)
        {
            if(i%2!=0)
            {
                System.out.print(" "+i);

            }
        }
    }
    
}
