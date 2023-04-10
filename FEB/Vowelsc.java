import java.util.Scanner;

public class Vowelsc {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str1 = sc.nextLine();
        char str[]=str1.toCharArray();
        int cnt=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str[i]=='a'||str[i]=='e'||str[i]=='o'||str[i]=='u'||str[i]=='i')
            {
                cnt++;

            }
        }
        System.out.print("Total vowels are :"+cnt);

        
    }
    
    
}
