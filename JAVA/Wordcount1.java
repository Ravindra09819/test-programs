import java.util.*;
import java.io.*;
public class Wordcount1 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sobj.nextLine();


        String newstr = str.replaceAll("\\s+", " ");
        String Arr[] = newstr.split(" ");
        System.out.println("number of word are :"+Arr.length);
    }
    
}
