package Practice.Easy;
public class Pascal_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            int c=1;
            for(int j=0;j<=i;j++){
                System.out.print(" "+c);
                c=c*(i-j)/(j+1);
            }
            System.out.println();
        }
    }   
}
