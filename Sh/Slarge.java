import java.util.Scanner;


public class Slarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number");
        int size = sc.nextInt();
        int x[]= new int[size];
        for(int i=0;i<size;i++)
        {
            x[i]=sc.nextInt();
        }
        int iMax=x[0];
        int sMax=x[0];
        int tMax=x[0];
        for(int i=0;i<size;i++)
        {
            if(x[i]>iMax)
            {
                
               sMax=iMax;
                iMax=x[i];

            }
            else if(x[i]>sMax&&x[i]<iMax)
            {
                sMax=x[i];
                
            }
            else if(x[i]<sMax&&x[i]>tMax)
            {
                tMax=x[i];
            }
            

        }
        System.out.println("max number is"+iMax);
        System.out.println("Second largest number"+sMax);
        System.out.println("third largest number"+tMax);

    }
    
}
