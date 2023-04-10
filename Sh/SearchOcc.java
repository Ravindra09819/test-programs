import java.util.*;
public class SearchOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Number:");
        int n = sc.nextInt();
       
        int Arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            Arr[i]=sc.nextInt();

        }
        System.out.println("search Number:");
        int s=sc.nextInt();
        System.out.print("position present");
        for(int i=0;i<n;i++)
        {
            if(Arr[i]==s)
        {
            System.out.print(" "+i);
        }
        else
        {
           // System.out.print("not present position: ");
        }
        }
        }

    }
    

