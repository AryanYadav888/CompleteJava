package leetcode.Quest.Maths.Divisibility_Modular;

import java.util.Scanner;

public class SmallestRepunitDivByK {
    public static int smallestRepunitDivByK(int k){
        if (k % 2 == 0 || k % 5 == 0) return -1;

        int num = 0;
        for (int len = 1; len <= k; len++) {
            num = (num * 10 + 1) % k;
//            System.out.println(num);
            if (num == 0) return len;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(smallestRepunitDivByK(n));
        smallestRepunitDivByK(n);
    }
}
