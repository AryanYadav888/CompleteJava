package InfiniteChampions.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Find First and Last Position of Element in Sorted Array
public class searchRange_34 {
    /*public static int firstIdx(int[] arr,int tar){
        int first = -1;
        int low = 0 , high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(tar == arr[mid]){
                first = mid;
                high = mid-1;
            } else if(tar<arr[mid]) high = mid-1;
            else {
                low = mid+1;
            }
        }
        return first;
    }
    public static int lastIdx(int[] arr,int tar){
        int last = -1;
        int low = 0 , high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(tar == arr[mid]){
                last = mid;
                low = mid+1;
            } else if(tar>arr[mid]) low = mid+1;
            else {
                high = mid-1;
            }
        }
        return last;
    }
    public static List<Integer> searchRange(int[] arr,int tar){
        int first = firstIdx(arr,tar);
        int last = lastIdx(arr,tar);

        if(first==-1) last = -1;

        List<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);

        return ans;
    }*/


    public static int findidx(int[] arr,int t,boolean first){
        int res = -1;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(arr[mid]==t){
                res = mid;
                if(first) r = mid-1;
                else l = mid+1;
            }
            else if(arr[mid]<t) l = mid+1;
            else r = mid-1;
        }
        return res;
    }
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findidx(nums,target,true),findidx(nums,target,false)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int tar = sc.nextInt();

        System.out.println(searchRange(arr,tar));
    }
}
