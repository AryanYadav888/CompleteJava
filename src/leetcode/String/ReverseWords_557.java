package leetcode.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords_557 {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseWords(String s){
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i] = reverse(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
            if(i < str.length -1) sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}
