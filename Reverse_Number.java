package Practice.Easy;
import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.print("The reversed Number is:"+rev);
        sc.close();
    }
}
