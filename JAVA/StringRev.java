import java.util.*;
public class StringRev 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");
        String newstr2 = newstr.trim();
        String Arr[]=newstr2.split(" ");
        for(int i=0;i<Arr.length;i++)
        {
            StringBuffer sb = new StringBuffer(Arr[i]);
            System.out.println(sb.reverse());
        }

    }
}
