import java.util.*;

class ReverseP
{
    public static void main(String args[])
    {
        int ivalue=0,rem,sum=0,n=0;
        
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter number:");
        ivalue=sobj.nextInt();
        n=ivalue;
        while(ivalue!=0)
        {
            rem=ivalue%10;
            sum=(sum*10)+rem;
            ivalue=ivalue/10;

        }
        if(n==sum)    
        {
            System.out.println(n+" is a Palindrome");
        }
        else
        {
             System.out.println(n+" is not a Palindrome");
        }
    

        
    }
}