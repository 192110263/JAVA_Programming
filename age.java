package Day_1;
import java.util.Scanner;
public class age {
    public static void main(String[] args){
        System.out.println("Enter Your Age:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a<18){
            System.out.print("You are Elgible to Vote");
        }
        else{
            System.out.print("Your are not elgible to Vote");
        }
        sc.close();
    }
}
