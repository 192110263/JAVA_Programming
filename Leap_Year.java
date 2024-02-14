package Practice.Easy;
import java.util.*;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Date:");
        String d=sc.nextLine();
        String[] c =d.split("/");
        int year=Integer.parseInt(c[2]);
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.print("the given date is from a LeapYear");
        }
        else{
            System.out.print("the given date is not from a LeapYear");
        }
        sc.close();
    }
}
