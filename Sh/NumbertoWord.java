import java.util.*;
public class NumbertoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        
        String [] thousandPosition ={"","One Thousands ","Two Thousands ","Three Thousands ",
        "Four Thousands ","Five Thousands ","Six Thousands ","Seven Thousands ",
        "Eight Thousands ","Nine Thousands "};
        String [] hundredPosition={"","One Hundred ","Two Hundred ","Three Hundred ","Four Hundred ",
        "Five Hundred ","Six Hundred ","Seven Hundred ","Eight Hundred ","Nine Hundred "};
        String [] specialCase={"","Elevne","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
                 "Eighteen","Nineteen"};
                 String [] tenposition={"","Ten","Twenty ","Thirty ","Forty ",
                 "Fifty ","Sixty ","Seventy","Eighty ","Ninety "};
                
                 String [] unitpos={"","One","Two","Three","Four","Five","Six",
                 "Seven","Eight","Nine"};
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
               
                if(number>10&&number<20)
                {
                    numberToword +=specialCase[number%divisor];
                    break;
                }
                else
                {
                    numberToword +=tenposition[quotient];
                }
            }
             else if(divisor == 1000)
            {
                numberToword +=thousandPosition[quotient];
            }
            else if(divisor == 100)
            {
                numberToword +=hundredPosition[quotient];
            }
            else if(divisor ==10)
            {
                if(number>10&&number<20)
                {
                    numberToword +=specialCase[number%divisor];
                    break;
                }
                else
                {
                    numberToword +=tenposition[quotient];
                }
            }
            else if(divisor==1)
            {
                numberToword +=unitpos[quotient];

            }
            int reminder = number %divisor;
            number = reminder;
            divisor =divisor/10;
        }
        System.out.println("Number is : "+numberToword);
    }
    
}
