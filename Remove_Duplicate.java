package Practice.Medium;
import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt(); 
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value at index "+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    break;
                }
                else{
                    b[i]=a[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]);
        }
        sc.close();
    }
}
