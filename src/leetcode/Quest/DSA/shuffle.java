package leetcode.Quest.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class shuffle {
    public static void Shuffle(int[] arr,int n){
        int[] res = new int[arr.length];
        int idx1 = 0 , idx2 = n ;
        int count=0;
        res[0] = arr[idx1++];
        for(int i=1;i<arr.length;i++){
            if(i%2 == 0) res[i] = arr[idx1++];
            else res[i] = arr[idx2++];
        }

        for(int i : res){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = sc.nextInt();

        Shuffle(arr,n);
    }
}
