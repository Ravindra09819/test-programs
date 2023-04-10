import java.util.*;
public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        String str1=str.trim();
        String Arr[]= str1.split(" ");
        System.out.print("Number of word are"+Arr.length);

        

    }
    
}
