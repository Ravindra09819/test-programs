import java.util.*;
class Magic
{
    public static void main(String args[])
    {
        //int ivalue=0,rem,number,sum=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numberrrrr");
        int ivalue = sc.nextInt();
        int n = ivalue;
        boolean isMagicNumber = false;

        while(ivalue != 1)
        {
            int new_num = ivalue/10;
            int rem = ivalue%10;
            ivalue = new_num*new_num + rem*rem;
            System.out.println(ivalue);
            //ivalue=sum;

            if(ivalue == 10 || ivalue == 100 || ivalue==1000){
                isMagicNumber = true;
                break;
            }
        }
           

        
        if(isMagicNumber)    
        {
            System.out.println(n+" is a magic number");
        }
        else
        {
             System.out.println(n+" is not a magic number");
        }
    


    }
}