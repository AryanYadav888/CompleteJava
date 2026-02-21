package Striver_A2Z.Step_4.Lec_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMedian {
    public static int findMedian(int[][] arr){
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                lst.add(arr[i][j]);
            }
        }
        return lst.get((lst.size())/2);
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

        System.out.println(findMedian(mat));
    }
}
