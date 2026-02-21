package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Koko_875 {
    public static long count(int[] piles,int k){
        long hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k;  //
        }
        return hours;
    }
    public static int minEatingSpeed(int[] piles,int h){
        int left = 1;
        int right = 0;

        for (int p : piles) {
            right = Math.max(right, p);
        }

        int ans = right;  // 11


        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = count(piles, mid);

            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        int h = sc.nextInt();

        System.out.println(minEatingSpeed(arr,h));
    }
}
