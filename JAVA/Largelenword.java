import java.util.*;
public class Largelenword 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sobj.nextLine();
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
        System.out.println("length of largest word are :"+iMax);
        System.out.println("largest word are :"+Arr[iPos]);
        
    }
    
}
