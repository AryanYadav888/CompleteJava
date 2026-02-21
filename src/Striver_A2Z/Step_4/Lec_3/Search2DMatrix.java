package Striver_A2Z.Step_4.Lec_3;

import java.util.Scanner;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] arr,int tar){
        int n = arr.length ,m = arr[0].length;
       /* for(int i=0;i<n;i++){
            int j = m-1;
            if(arr[i][j]==tar) return true;
            else if(arr[i][j]>tar){
                for(int k=0;k<=m-2;k++){
                    if(arr[i][k] == tar) return true;
                }
            }
        }
        return false;*/

        int i=0,j=m-1;
        while (i<n && j>=0){
            if(arr[i][j] == tar) return true;
            else if(arr[i][j]>tar) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int tar = sc.nextInt();
        System.out.println(searchMatrix(mat,tar));
    }
}
