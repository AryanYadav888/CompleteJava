package leetcode.SlidingWindow;

import java.util.*;

public class WindowMedian_480 {
    public static void balanceHeap(PriorityQueue<Long> maxheap,PriorityQueue<Long> minheap){
        if(maxheap.size() > minheap.size()+1) minheap.offer(maxheap.poll());
        else if (minheap.size() > maxheap.size()) {
            maxheap.offer(minheap.poll());
        }
    }
    public static String medianSlidingWindow(int[] arr,int k){
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        double[] result = new double[arr.length-k+1];

        for(int i=0;i<arr.length;i++){
            long num = arr[i];

            if(maxHeap.isEmpty() || num<=maxHeap.peek()){
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            balanceHeap(maxHeap,minHeap);

            if(i >= k){
                long toRemove = arr[i-k];
                if(toRemove <= maxHeap.peek()){
                    maxHeap.remove(toRemove);
                } else {
                    minHeap.remove(toRemove);
                }
                balanceHeap(maxHeap,minHeap);
            }
            if (i >= k - 1) {
                if (maxHeap.size() == minHeap.size()) {
                    result[i - k + 1] = ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
                } else {
                    result[i - k + 1] = (double) maxHeap.peek();
                }
            }
        }
        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        System.out.println(medianSlidingWindow(arr,k));
    }
}
