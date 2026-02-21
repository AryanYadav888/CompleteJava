package Striver_A2Z.Step_4.Lec_1;

import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static int Search(int[] arr,int tar){

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int tar = sc.nextInt();
        System.out.println(Search(arr,tar));
    }
}
