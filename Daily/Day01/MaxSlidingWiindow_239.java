package InfiniteChampions.Day1;

import java.util.*;

public class MaxSlidingWiindow_239 {
    public static int Max(int[] arr,int start,int end){
        int max = arr[start];
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }

    public static List<Integer> maxSlidingWindow(int[] arr, int k){
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = k-1;
        int max = Max(arr,start,end);
        ans.add(max);
        for(int i=1;i<=arr.length-k;i++){
            int newMax = Max(arr,i,i+k-1);
            ans.add(newMax);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        System.out.println(maxSlidingWindow(arr,k));
    }
}
