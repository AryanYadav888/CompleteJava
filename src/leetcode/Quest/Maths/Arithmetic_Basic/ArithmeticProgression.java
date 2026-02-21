package leetcode.Quest.Maths.Arithmetic_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(canMakeArithmeticProgression(arr));
    }
}
