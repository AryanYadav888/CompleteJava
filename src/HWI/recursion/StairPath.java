package HWI.recursion;

import java.util.Scanner;

public class StairPath {
    public static int path(int n){
        if(n <= 2) return n;

        return path(n-1)+path(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ns = 0;
        System.out.println(path(n));
    }
}
