package InfiniteChampions.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray_88 {
    public static void merge(int[] arr1,int m,int[] arr2,int n){
        int i = m-1,j = n-1,k = m+n-1;
        while (j>=0){
            if(i>=0 && arr1[i]>arr2[j]) arr1[k--] = arr1[i--];
            else arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = sc.nextInt();

        sc.nextLine();

        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        merge(arr1,m,arr2,arr2.length);

        for(int i : arr1){
            System.out.print(i+" ");
        }
    }
}
