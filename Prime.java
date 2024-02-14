package Practice.Easy;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Start Number:");
        int m=sc.nextInt();
        System.out.print("enter the End Number:");
        int n=sc.nextInt();
        System.out.print("The prime Number between "+m+" and " +n+" are:");
        for(int i=m;i<=n;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
