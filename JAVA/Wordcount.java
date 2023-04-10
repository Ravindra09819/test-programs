import java.util.Scanner;
import java.io.*;
public class Wordcount
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sobj.nextLine();
        String Arr[]=str.split(" ");

        System.out.println(" number of word are: "+Arr.length);

    }
    
}
