package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class CountSubarrya {
    public static int subarraySum(int[] arr,int k){
        int n = arr.length,count=0;
        for(int i=0;i<n;i++){
            int num = 0;
            for(int j=i;j<n;j++){
                num += arr[j];
                if(num == k) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int k = sc.nextInt();
        System.out.println(subarraySum(arr,k));

    }
}
