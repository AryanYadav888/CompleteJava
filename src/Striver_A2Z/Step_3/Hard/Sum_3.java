package Striver_A2Z.Step_3.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum_3 {
    public static List<List<Integer>> sum(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> lst = new ArrayList<>();
                        lst.add(arr[i]);
                        lst.add(arr[j]);
                        lst.add(arr[k]);
                        ans.add(lst);
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(arr));
    }
}
