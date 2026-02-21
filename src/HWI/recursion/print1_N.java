package HWI.recursion;

import java.util.Scanner;

public class print1_N {
    public static void function(int n){
        if(n <= 0) return;
        function(n-1);                // ( 1 to  n)
        System.out.println(n);
//        function(n-1);           // (n to 1)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
}
