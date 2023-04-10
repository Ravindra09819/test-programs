import java.util.*;
class SumN
{
    public static void main(String args[])
    {
        int ivalue=0 ,rem,number,sum=0;;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        ivalue=sobj.nextInt();
        while(ivalue!=0)
        {
            
            rem=ivalue%10;
            sum=sum+rem;
            ivalue=ivalue/10;

        }
        System.out.print("Sum is: "+sum);


    }
}