package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeros {
    public static void markRow(int[][] arr,int i,int m){
        for(int j=0;j<m;j++){
            if(arr[i][j]!=0) arr[i][j] = -1;
        }
    }
    public static void markCol(int[][] arr,int j,int n){
        for(int i=0;i<n;i++){
            if(arr[i][j]!=0) arr[i][j] = -1;
        }
    }
    public static void bruteForce(int[][] arr){
        int n = arr.length , m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    markRow(arr,i,m);   // mark that row to -1
                    markCol(arr,j,n);   // mark that col to -1
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == -1) arr[i][j] = 0;
            }
        }
    }


    public static void betterCode(int[][] arr){
        int n = arr.length , m = arr[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j] = 0;
                }
            }
        }
    }


    public static void optimized(int[][] arr){
        int n = arr.length , m = arr[0].length;
        int col0 = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (arr[i][j] == 0){
                    arr[i][0] = 0;

                    if(j!=0) arr[0][j] = 0;
                    else col0 = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if (arr[i][j] !=0){
                    if(arr[0][j] == 0 || arr[i][0] == 0) arr[i][j] = 0;
                }
            }
        }
        if(arr[0][0] == 0){
            for(int j=0;j<m;j++){
                arr[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<n;i++){
                arr[i][0] = 0;
            }
        }

    }


    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr_2d = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr_2d[i][j] = sc.nextInt();
            }
        }

//        bruteForce(arr_2d);    // time Complexity O(n^3)
//        betterCode(arr_2d);      // time Complexity O(n^2) but space O(n+m)
        optimized(arr_2d);         // time Complexity O(n^2)
        print(arr_2d);

    }
}
