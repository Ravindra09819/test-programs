import java.util.*;

class A{
    public static void main(String args[])
    {
    Scanner so=new Scanner(System.in);
    System.out.println("Enter a string\n");
    String  str=so.nextLine();
    System.out.println(reversevowel(str));
    }

    public static boolean isvowel(char c)
    {
        return (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U');
    }

   public static String  reversevowel(String str1)
   {
    int j=0;
    char str[]=str1.toCharArray();
    String vowel=" ";
    for(int i=0;i<str.length;i++)
    {
        if(isvowel(str[i]))
        {
         j++;
         vowel +=str[i];
        }
    }

    for(int i=0;i<str.length;i++)
    {
        if(isvowel(str[i]))
        {
            str[i]=vowel.charAt(--j);
        }
    }
    return String.valueOf(str);
   }
}