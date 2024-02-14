package Practice.Easy;
import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principle Amount:");
        double p=sc.nextDouble();
        System.out.print("Enter the rate of Interest:");
        double i=sc.nextDouble();
        System.out.print("Enter the time in months:");
        int t=sc.nextInt();

        double si=(p*t*i)/100;
        System.out.print("Enter the Simple Interest is:"+si);
        sc.close();
    }
}
