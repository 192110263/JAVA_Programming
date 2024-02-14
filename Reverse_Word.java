package Practice.Easy;
import java.util.*;
public class Reverse_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the word:");
        String a=sc.nextLine();
        String b="";
        int l=a.length();
        for(int i=l-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.print("The Reversed Word is:"+b);
        sc.close();
    }
}
