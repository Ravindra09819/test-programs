import java.util.*;
public class NumbertoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
    
                 String [] unitpos={"Zero ","One ","Two ","Three ","Four ","Five ","Six ",
                 "Seven ","Eight ","Nine "};
        int number = sc.nextInt();
        int divisor = 10000;
        String numberToword="";
        if(number<=0)
        {
            System.out.print("please enter valid number:");
        }
        while(number!=0)
        {
            int quotient=number/divisor;
            if(divisor == 10000)
            {
               
                    numberToword +=unitpos[quotient];

            }
            
            //  else if(divisor == 1000)
            // {
            //     numberToword +=unitpos[quotient];
            // }
            // else if(divisor == 100)
            // {
            //     numberToword +=unitpos[quotient];
            // }
            // else if(divisor ==10)
            // {
                
               
            //         numberToword +=unitpos[quotient];
                
            // }
            // else if(divisor==1)
            // {
            //     numberToword +=unitpos[quotient];

            // }
            int reminder = number %divisor;
            number = reminder;
            divisor =divisor/10;
        }
        System.out.println("Number is : "+numberToword);
    }
    
}