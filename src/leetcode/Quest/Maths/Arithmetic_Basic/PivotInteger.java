package leetcode.Quest.Maths.Arithmetic_Basic;

import java.util.Scanner;

public class PivotInteger {
   /* public static int pivotInt(int n){
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++) arr[i] = i;

        int i=0,j=n;
        while (i<=j){
            int pivot = (i+j)/2;
            int sumLeft = 0;
            for(int k=1;k<=pivot;k++) sumLeft += k;

            int sumRight = 0;
            for(int k=pivot;k<=n;k++) sumRight += k;

            if(sumLeft == sumRight) return pivot;
            else if (sumLeft < sumRight) {
                i = pivot+1;
            }
            else j = pivot-1;
        }
        return -1;
    }*/

    public static int pivotInt(int n){
        int total = n * (n + 1) / 2;
        int x = (int)Math.sqrt(total);

        if (x * x == total) return x;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pivotInt(n));
    }
}
