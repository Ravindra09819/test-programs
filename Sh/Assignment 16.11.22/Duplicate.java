import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
		String str = sc.nextLine();

		StringBuilder bk = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (bk.indexOf(String.valueOf(str.charAt(i))) == -1) {

				bk.append(str.charAt(i));

			}
		}

		System.out.println("Original String : " + str);
		System.out.println("After removing the duplicates : " + bk.toString());

	}

}
