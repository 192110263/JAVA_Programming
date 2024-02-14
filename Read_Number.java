package Practice.Medium;
import java.util.*;
public class Read_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int posnum=0;
        int negnum=0;
        int psum=0;
        int nsum=0;
        while(n!=-1){
            System.out.print("Enter the Number:");
            n=sc.nextInt();

            if(n>0){
                psum+=n;
                posnum++;
            }
            else if(n<0){
                nsum+=n;
                negnum++;
            }
        }
        double i=(nsum/negnum);
        double j=(psum/posnum);
        System.out.println("The average of negative numbers is:"+i);
        System.out.println("The average of positive numbers is:"+j);
        sc.close();
    }
}