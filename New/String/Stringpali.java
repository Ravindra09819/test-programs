import java.util.Scanner;

public class Stringpali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        String rev="";
        
        for(int i=a.length-1;i>=0;i--)
        {
            rev=rev+a[i];

        }
        if(str.equals(rev))
        {
            System.out.print("String is paliindr: "+str );
        }
        else
        {
            System.out.print("String is not paliindr: "+str);
        }
    }
    
}
