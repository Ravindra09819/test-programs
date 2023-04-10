import java.util.Scanner;

public class Trim
 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sobj.nextLine();

        String strnew = str.trim();
        String Arr[] = strnew.split(" ");
        System.out.println("number of word are: "+Arr.length);

    }
}
