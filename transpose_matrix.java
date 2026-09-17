//Implement a java program to find the transpose of a matrix.
import java.util.Scanner;
public class transpose_matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[10][10];
        int m,n,i,j;
        System.out.print("Enter the number of rows : ");
        m=sc.nextInt();
        System.out.print("Enter the size of column : ");
        n=sc.nextInt();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter the element : ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            System.out.println();
            for(j=0;j<n;j++){
                System.out.print(" "+arr[i][j]+"\t");
            }
        }
        System.out.println("\nTRANSPOSE MATRIX!");
        for(i=0;i<n;i++){
            System.out.println();
            for(j=0;j<m;j++){
                System.out.print(" "+arr[j][i]+"\t");
            }
        }
    }
}