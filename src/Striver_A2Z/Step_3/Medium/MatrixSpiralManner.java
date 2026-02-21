package Striver_A2Z.Step_3.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixSpiralManner {
    public static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length , m = matrix[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;

        while (top<=bottom && left<=right){
//            for moving left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
//            for moving top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
//            for moving right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
//            for moving bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
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

        System.out.println(spiralOrder(arr_2d));

    }
}
