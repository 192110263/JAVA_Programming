package Day_2;
import java.util.*;
public class Collections {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no.of Element:");
        int n=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+":");
            int element=sc.nextInt();
            list.add(element);
        }
        System.out.print("Elements in the ArrayList:"+list);
        sc.close();
    }
}
