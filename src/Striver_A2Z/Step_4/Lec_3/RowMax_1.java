package Striver_A2Z.Step_4.Lec_3;

import java.util.HashMap;
import java.util.Scanner;

public class RowMax_1 {
    public static int rowWithMax1s(int[][] mat){
        int row = mat.length , col = mat[0].length;
        int maxCount=0,idx = -1;
        for(int i=0;i<row;i++){
            int count = 0;
            for(int j=0;j<col;j++){
                if(mat[i][j] == 1) count++;
            }
            if(count>maxCount){
                maxCount = count;
                idx = i;
            }
        }
        return idx;
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

        System.out.println(rowWithMax1s(mat));
    }
}
