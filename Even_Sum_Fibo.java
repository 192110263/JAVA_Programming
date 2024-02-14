package Practice.Easy;
import java.util.*;
public class Even_Sum_Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Limit:");
        int n=sc.nextInt();
        int a1=0,a2=1,a3=0;
        int a[]=new int[50];
        System.out.print("Fibonacci Series:");
        for(int i=0;i<n;i++){
            a[i]=a1;
            a3=a1+a2;
            System.out.print(" "+a1);
            a1=a2;
            a2=a3;
        }
        System.out.println();
        int sum=0;
        System.out.print("Even Index Fibonacci Series:");
        for(int j=0;j<n;j=j+2){
            sum+=a[j];
            System.out.print(" "+a[j]);
        }

        System.out.println();
        System.out.print("The Even Index Sum of Fibonacci Series is :");
        System.out.println(sum);
        sc.close();
    }
}
