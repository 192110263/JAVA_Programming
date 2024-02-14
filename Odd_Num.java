package Day_1;
import java.util.*;
public class Odd_Num {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the Size of the array:");
        int n=sc.nextInt();
        int[] Num= new int[n];
        //entering inputs into the array
        System.out.print("enter the elements into the array:");
        for(int i=0;i<n;i++){
            Num[i]=sc.nextInt();
        }
        int count=0;
        int[] Odd=new int[n];
        for(int j=0;j<n;j++){
            if(!(Num[j]%2==0)){
                Odd[j]=Num[j];
                count=count+1;
            }
        }
        System.out.print("the odd numbers are:");
        for(int k:Odd){
            System.out.print(k);
        }
        sc.close();
    }
}
