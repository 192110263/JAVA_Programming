import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.print("Enter the nth Factor:");
        int N=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<number;i++){
            if(number%i==0){
                list.add(i);
            }
        }
        System.out.print("List"+list);
        System.out.println();

        while(N>list.size()){
            System.out.println("the Number "+N+" has only "+list.size()+"Factors!!");
            System.out.println("Enter the Nth value again:");
            N=sc.nextInt();
        }
        System.out.println("the Nth Factor is:"+list.get(N-1));
    }
}
