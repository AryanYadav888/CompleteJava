package leetcode.Quest.DSA.Array2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ErrorNums {
    public static void findErrorNums(int[] arr){
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();

        int duplicate = -1;
        int n = arr.length;
        int sum = 0;

        for(int i : arr){
            if(set.contains(i)){
                duplicate = i;     // repeated number
            } else {
                set.add(i);
            }
            sum += i;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (sum - duplicate);

        res[0] = duplicate;
        res[1] = missing;

        for(int i : res) System.out.print(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        findErrorNums(arr);
    }
}
