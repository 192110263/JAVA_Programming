import java.util.*;
public class PrintSpecialChars {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Text:");
		String name = sc.nextLine();
		int count=0;
		for(int i=0; i<name.length();i++) {
			if(!((Character.isLetterOrDigit(name.charAt(i))|| (Character.isWhitespace(name.charAt(i)))))) {
				System.out.print(name.charAt(i));
				count++;
			}
		}
		System.out.println();
		System.out.println("no of Special Characters are:" +count);
	}
}
