import java.util.Scanner;
import java.io.*;

public class Filelength 
{
    public static void main(String[] args) 
    {
        try
        {
        Scanner sobj =  new Scanner(System.in);
        System.out.println("Please enter file name ");
        String Filename = sobj.nextLine();
        File fobj = new File(Filename);
        
        if(fobj.exists())
        {
            long size = fobj.length();
            System.out.println("file size is: "+size);
        }
        else
        {
            System.out.println("their is no such file");
        }
    }
     catch (Exception e) {
        System.out.println(e);
    }
    }

    
}
