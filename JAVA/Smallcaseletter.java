import java.util.*;
public class Smallcaseletter 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sobj.nextLine();
        char Arr[]=str.toCharArray();
        int icnt=0;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]>='a'&&Arr[i]<='z')
            {
               icnt++;
            }
        }
          System.out.println("number of small case letter are :"+icnt);

    }
}
