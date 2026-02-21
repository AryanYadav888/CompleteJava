package leetcode.Quest.Maths.CombinationAndPermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(getPermutation(n,k));
    }

    private static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);

        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++)
            fact[i] = fact[i - 1] * i;    // [1,1,2]

        k--;    // 2

        StringBuilder sb = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            int idx = k / fact[i - 1];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k %= fact[i - 1];
        }

        return sb.toString();
    }
}
