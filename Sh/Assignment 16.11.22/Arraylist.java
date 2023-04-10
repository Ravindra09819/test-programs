import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.print("how many word: ");
    int n=sc.nextInt();
    System.out.println("Please enter a word:");
    String str =sc.nextLine();
    
   List<String> al=new ArrayList<String>();
   for(int i=0;i<n;i++)
   {
    
    str=sc.nextLine();
    al.add(str);
   }
	System.out.println(al);
	
  }
}