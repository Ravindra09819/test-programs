import java.util.*;
/*
 #$ #$ #$ #$
 #$ #$ #$
 #$ #$ 
 #$ 
  
 */
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("#$"+" ");
            }
            System.out.print("\n");
        }
    }
    
}
