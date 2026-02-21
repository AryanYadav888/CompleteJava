package Striver_A2Z.Step_3.Medium;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr){
        int n = arr.length;
        if(n==0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while (set.contains(x+1)){
                    x = x+1;
                    cnt += 1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(longestConsecutive(arr));
    }
}
