package Day_1;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number n:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("the Factorial of n is:"+sum);
        sc.close();
    }
}
