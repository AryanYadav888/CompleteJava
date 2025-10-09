package InfiniteChampions.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// leetcode
public class MinArrowsShots_452 {
    public static int findMinArrowShots(int[][] points){
        int n = points.length;
        if(n==1) return 1;

//         sorting
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int arrow = 1;
        int cEndPoint = points[0][1];
        for(int i=1;i<n;i++){
            int curS = points[i][0];
            int curE = points[i][1];

            if(curS>cEndPoint){
                cEndPoint = curE;
                arrow++;
            }
        }
        return arrow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] points = new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                points[i][j] = sc.nextInt();
            }
        }
        System.out.println(findMinArrowShots(points));
    }
}
