import java.util.*;
public class Stringvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char a[]=str.toCharArray();
        int cnt=0;
        int pos=0;
        for(int i=0;i<str.length();i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='i'
            ||a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='U'||a[i]=='I')
            {
            cnt++;
               pos =i;
               System.out.print(a[i]+" ");
            }
            
        }
        System.out.print("\nThe number of vowels are :"+cnt);
       
        
    }
    
}
