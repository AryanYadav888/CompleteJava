package Striver_A2Z.Step_3.Medium;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.BubbleSort.swap;
import static Sorting.InsertionSort.print;
import static Striver_A2Z.Step_1.ReverseArray.reverse;

public class NextPermutation {
    public static void nextPremutation(int[] arr){
        int idx = -1, n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr,0,n-1);
            return;
        }

        for(int i=n-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }

        reverse(arr,idx+1,n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        nextPremutation(arr);
        print(arr);
    }
}
