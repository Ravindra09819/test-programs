import java.util.*;
public class EvenNumber {
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sobj.nextInt();
        sobj.close();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(" "+i);
            }
            
        
    }
    }
}

    

