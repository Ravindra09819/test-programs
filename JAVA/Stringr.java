import java.io.*;
import java.util.*;


class Stringr
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        String  str=sobj.nextLine();
        String Rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            
            Rev=Rev+str.charAt(i);
        }
        if(str.equals(Rev));
        {
            System.out.print("String palindrome"+str);

        }
    }
}