//Implement a java program to perform multiplication of two matrices.
import java.util.Scanner;
public class matrix_mul{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][]arr_a=new int[10][10];
        int[][]arr_b=new int[10][10];
        int m,n,i,j;
        System.out.print("Enter the number of rows : ");
        m=sc.nextInt();
        System.out.print("Enter the size of column : ");
        n=sc.nextInt();
        //FIRST MATRIX
        System.out.println("FIRST MATRIX");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter the element : ");
                arr_a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            System.out.println();
            for(j=0;j<n;j++){
                System.out.print(" "+arr_a[i][j]+"\t");
            }
        }
        //SECOND MATRIX
        System.out.println("\nSECOND MATRIX");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter the element : ");
                arr_b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++){
            System.out.println();
            for(j=0;j<n;j++){
                System.out.print(" "+arr_b[i][j]+"\t");
            }
        }
        System.out.println("\nMultiplication OF MATRIX");
        for(i=0;i<m;i++){
            System.out.println();
            for(j=0;j<n;j++){
                System.out.print(arr_a[i][j]*arr_b[i][j]+"\t");
            }

        }

        
    }
}