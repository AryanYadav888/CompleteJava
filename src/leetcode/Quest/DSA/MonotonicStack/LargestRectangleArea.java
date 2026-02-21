package leetcode.Quest.DSA.MonotonicStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleArea {
    public static int largestRectangleArea(int[] arr){
        int maxA = 0 , n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            int h = (i == n ? 0 : arr[i]);
            while (!st.isEmpty() && h < arr[st.peek()]){
                int hei = arr[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right -left-1;
                maxA = Math.max(maxA,hei*width);
            }
            st.push(i);
        }
        return maxA;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(largestRectangleArea(arr));
    }
}
