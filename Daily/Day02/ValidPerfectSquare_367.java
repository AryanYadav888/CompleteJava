package InfiniteChampions.Day2;

import java.util.Scanner;

public class ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int n){
        int left = 0,right=n;
        while (left<right){
            int mid = left + (right-left)/2;
            if(mid*mid==n) return true;
            else if(mid*mid > n) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPerfectSquare(num));
    }
}
