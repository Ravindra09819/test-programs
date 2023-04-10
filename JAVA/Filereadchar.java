import java.util.Scanner;
import java.io.*;

class Filereadchar
{
    public static void main(String[] args) {
        try {
            Scanner sobj = new Scanner(System.in);
            System.out.print("please enter file name ");

            String filename = sobj.nextLine();

            File fobj = new File(filename);

            if(fobj.exists())
            {
                BufferedReader bobj = new BufferedReader(new FileReader(fobj));
                String str;

                while((str=bobj.readLine())!=null)
                {
                    System.out.println(str);
                }
            }
            else
            {
                System.out.println("their no such file");
            }



        } catch (Exception e) {
            System.out.println(e);
        }
    }
}