import java.util.*;
import java.io.*;
import java.lang.*;
public class Createfile 
{
    public static void main(String[] args) {
        
    

try {
    Scanner sobj = new Scanner(System.in);
    

    System.out.println("Please enter file name ");
    String Filename = sobj.nextLine();

    File fobj =  new File(Filename);

    boolean bobj = fobj.createNewFile();
    if(bobj==true)
    {
        System.out.println("File is succesfully created");
    }
    else
    {
        
        System.out.println("File is Already exitsting ");

    }

} catch (IOException obj) {
    System.out.println(obj);
    
}

}
}