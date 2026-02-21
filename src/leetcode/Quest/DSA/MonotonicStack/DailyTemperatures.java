package leetcode.Quest.DSA.MonotonicStack;

import java.util.*;

public class DailyTemperatures {
    public static String dailyTemperatures(int[] arr){
        List<Integer> lst = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i : arr) lst.add(0);
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int idx = st.pop();
                lst.set(idx , i-idx);
            }
            st.push(i);
        }
        return lst.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(dailyTemperatures(arr));
    }
}
