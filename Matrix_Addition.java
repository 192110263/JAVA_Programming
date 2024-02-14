package Day_1;
public class Matrix_Addition {
    public static void main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int[3][3];
        //sum of the elements in the array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        //printing the elements in the array
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
    }
}
