package leetcode.Quest.Maths.Divisibility_Modular;

import java.util.Scanner;
import java.util.*;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        System.out.println(selfDividingNumbers(left,right).toString());
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(isTrue(i)){
                lst.add(i);
            }
        }

        return lst;
    }

    private static boolean isTrue(int n) {
        int num = n;
        while (num > 0){
            int digit = num%10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
