import java.util.Scanner;

public class Stringw 
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of word :");
    int n =sc.nextInt();
    
    System.out.print("Enter word :\n");
  
    String a[] = new String[n]; 
    for(int i=0;i<n;i++)
    {
        
        a [i]= sc.nextLine();
    }
    for(int i=0;i<n;i++)
    {
        
       System.out.print(a[i]+" ");
    }


    }
}
