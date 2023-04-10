import java.util.*;
public class Largeword
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String Arr[]=str.split(" ");
        int iMax=0;
        int iPos=0;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i].length()>iMax)
            {
               iMax= Arr[i].length();
               iPos=i;
            }
        }
    System.out.print("Length of largest word :"+iMax);
    System.out.print("\nLarge word is: "+Arr[iPos]);
    }
    
}
