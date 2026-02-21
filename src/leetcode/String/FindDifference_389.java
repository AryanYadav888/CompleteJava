package leetcode.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDifference_389 {
    public static char findtheDifference(String s,String t){
        char ch = 0;
        for(char c:s.toCharArray()) ch ^= c;
        for(char c:t.toCharArray()) ch ^= c;
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(findtheDifference(str1,str2));

    }
}
