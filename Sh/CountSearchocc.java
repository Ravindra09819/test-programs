import java.util.Scanner;

public class CountSearchocc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int Arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            Arr[i]= sc.nextInt();
        }
        System.out.println("search  number:");
        int s = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(Arr[i]==s)
            {
                count++;

            }

        }
        System.out.println(count+"times numbers");
    }
}