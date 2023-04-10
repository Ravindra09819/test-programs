import java.util.Scanner;

public class Hashtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
         char arr[]=str.toCharArray();
       
       
    {
        for(char c = 'a';c <='z';c++)
        {
            int frequency = 0;
            for(int i = 0;i < str.length();i++)
                if(arr[i] == c)
                    frequency++;
            System.out.println(c+" "+frequency);
        }
        
    }
    }
    
}
