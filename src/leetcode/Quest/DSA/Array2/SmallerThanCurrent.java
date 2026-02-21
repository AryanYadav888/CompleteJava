package leetcode.Quest.DSA.Array2;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        smallerNumbersThanCurrent(arr);
    }

    private static void smallerNumbersThanCurrent(int[] arr) {
        int n = arr.length ;
        int[] res = new int[n];
        for (int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i] > arr[j]) count++;
                }
            }
            res[i] = count;
        }


        for (int i : res){
            System.out.print(i);
        }
    }
}
