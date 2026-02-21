package leetcode.Quest.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr){
        int maxOne = 0;
        int one = 0;
        for(int i : arr){
            if(i!=1) one = 0;
            else one++;
            maxOne = Math.max(maxOne,one);
        }
        return maxOne;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
