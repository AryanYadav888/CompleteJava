package leetcode.Quest.DSA.Stack;

import java.util.*;

public class buildArray {
    public static void BuildArray(int[] arr,int n){
        List<String> ops = new ArrayList<>();
        int curr = 1;

        for(int t : arr){
            while (curr < t){
                ops.add("Push");
                ops.add("Pop");
                curr++;
            }
            ops.add("Push");
            curr++;
        }

        for (String s : ops){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = sc.nextInt();

        BuildArray(arr,n);
    }
}
