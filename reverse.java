import java.util.*;
public class reverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		System.out.print("Original Text:" +str);
		char ch;
		String nstr="";
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			nstr= ch+nstr;
			
		}
		System.out.println("Reversed word:" +nstr);
	}
}
