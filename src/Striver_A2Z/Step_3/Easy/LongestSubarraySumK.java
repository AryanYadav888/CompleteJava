package Striver_A2Z.Step_3.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k){
        int left = 0 , sum = 0,maxlength = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            while (sum>k && left<=i){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlength = Math.max(maxlength,i-left+1);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        System.out.println(longestSubarray(arr,k));
    }
}
