import java.util.*;
public class Countvowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char Arr[] = str.toCharArray();
        int icnt=0;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='i'||Arr[i]=='o'||Arr[i]=='u')
            {
                icnt++;

            }
        }
        System.out.print("number of vowels "+icnt);
    }
    
}
