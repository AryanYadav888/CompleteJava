package HWI.recursion;

import java.util.Scanner;

public class sum1ToN {
    public static int function(int n){
        if(n <= 0) return 0;

        return n + function(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println(function(n));
    }
}
