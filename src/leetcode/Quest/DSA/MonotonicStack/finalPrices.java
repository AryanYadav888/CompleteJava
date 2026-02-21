package leetcode.Quest.DSA.MonotonicStack;

import java.util.*;

public class finalPrices {
    public static String FinalPrices(int[] arr){
        List<Integer> lst = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int price : arr) lst.add(price);

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                int idx = st.pop();
                lst.set(idx, lst.get(idx) - arr[i]);
            }
            st.push(i);
        }


        return lst.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(FinalPrices(arr));
    }
}
