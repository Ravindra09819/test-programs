import java.io.*;
import java.util.*;

class pali
{
    public static void main(String args[])
    {
        Scanner so=new Scanner(System.in);
        int number=so.nextInt();
        int sum=0,rem;
       
        int temp=number;
        while(number>0)
        {
             rem=number%10;
            sum=sum*10+rem;
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.print("Number is pali"+temp);
        }
        else
        {
            System.out.print("Number is not pali"+temp);

        }
    }
}