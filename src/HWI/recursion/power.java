package HWI.recursion;

import java.util.Scanner;

public class power {
    /*
    public static int function(int a,int b){
        if(b == 0) return 1;
        return a*function(a,b-1);
    }
    */

    public static int function(int a,int b){
        if(b == 0) return 1;
        int ans = function(a,b/2);
        if(b%2 == 0) return ans*ans;
        else return ans*ans * a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(function(a,b));
    }
}
