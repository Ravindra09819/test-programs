import java.util.Scanner;

public class Stringtochar 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sobj.nextLine();

        char Arr[]=str.toCharArray();
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }


    }
    
}
