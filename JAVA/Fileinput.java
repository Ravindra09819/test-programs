import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class Fileinput {
    public static void main(String[] args) {
        try 
        {
            Scanner sobj =  new Scanner(System.in);
            System.out.println("please enter file name");
            String filename = sobj.nextLine();

            File fobj = new File(filename);
            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                byte buffer [] = new byte[100];
                int ret = 0;
                int sum = 0;

                while((ret = fiobj.read(buffer))!=-1)

                {
                    sum = sum+ret;
                    String str1 = new String(buffer,StandardCharsets.UTF_8) ;
                    System.out.println(str1);

                }
            }
            else
            {
                System.out.println("Their is no such file ");
            }

        } catch (Exception e) 
        {
            // TODO: handle exception 
            System.out.println(e);
        }
    }
    
}
