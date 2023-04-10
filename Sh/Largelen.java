import java.util.*;

public class Largelen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string :");
        String str =sc.nextLine();
        String Arr[]=str.split(" ");
        int iMax=0;
        int iPos=0;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i].length()>iMax)
            {
                iMax=Arr[i].length();
                iPos=i;
            }
        }
        
        System.out.println("logest string number :"+iMax);
        System.out.print("logest string is :"+Arr[iPos]);

    }
    
}
