import java.util.Scanner;

/*
 A
 B B
 C C C 
 D D D D
 */
class A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("print How many char:\n");
        int row = sc.nextInt();
        int col=row;
        for(char i=1, ch='A';i<=row;i++,ch++)
        {
            for(char j=1,a='A';j<=i;j++,a++)
            {
                System.out.print(a+" ");
            }
            System.out.print("\n");
        }
    }
}