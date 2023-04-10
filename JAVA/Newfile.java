import java.util.*;
import java.io.*;
import java.lang.*;
import java.nio.charset.StandardCharsets;
public class Newfile 
{
    public static void main(String[] args) {
        try {
            Scanner sobj = new Scanner(System.in);
            System.out.println("please enter existing file");
            String filename = sobj.nextLine();

            File fobj = new File (filename);
            System.out.println("Enter new file name to create");
            String newfile=sobj.nextLine();
            File fobjnew=new File(newfile);
            boolean bobj1=fobjnew.createNewFile();
            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                FileOutputStream foobj = new FileOutputStream(fobjnew);
                byte buffer[]=new byte[100];
                int ret=0;
                while(  (ret=fiobj.read(buffer))!=-1)
                {
                    foobj.write(buffer);
                }
            }
            else
            {
                System.out.println("Their is no such a file");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    
}
