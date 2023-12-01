package Schoolwork;

import java.util.Scanner;

public class YangHuis_triangle {

    static void PrintTriangle(int[][] matrix){
        int i,j;
        for(i=1;i<matrix.length;i++){
            for(j=0;j<i;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void CreateTriangle(int[][] matrix,int n){
        int i,j;
        for(i=0;i<n+1;i++){
            for(j=0;j<i;j++){
                if(j==0){
                    matrix[i][j]=1;
                }
                if(j==i-1){
                    matrix[i][j]=1;
                }
                if(j>0 && j<i-1){
                    matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
                }
            }
        }
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix = new int[n+1][n+1];

        CreateTriangle(matrix,n);
        PrintTriangle(matrix);

    }
}
