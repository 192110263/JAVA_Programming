package Day_2;
import java.util.*;
public class Exception_Handeling {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number:");
			String a=sc.nextLine();
			int i=Integer.parseInt(a);
			System.out.println("the Entered Integer is:" +i);
            sc.close();
		}
		catch(NumberFormatException e){
			System.out.println("Enter a Interger value!!");
		}
	}
}
