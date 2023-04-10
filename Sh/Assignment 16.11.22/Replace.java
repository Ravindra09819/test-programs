import java.util.Scanner;

class Replace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
    System.out.println(str.replace(' ', 'a'));
    }
} 