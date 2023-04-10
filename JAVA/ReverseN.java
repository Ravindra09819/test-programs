import java.util.*;
class ReverseN
{
    public static void main(String args[])
    {
        int ivalue=0 ,rem,sum=0;;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number");
        ivalue=sobj.nextInt();
        while(ivalue!=0)
        {
            
            rem=ivalue%10;
            sum=(sum*10)+rem;
            ivalue=ivalue/10;

        }
        System.out.print("Sum is: "+sum);


    }
}