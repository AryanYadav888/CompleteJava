package leetcode.Quest.DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class EvalRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }

        System.out.println(evalRPN(str));
    }

    private static int evalRPN(String[] str) {
        Stack<Integer> st = new Stack<>();

        for(String s : str){
            if(s.equals("+")){
                st.push(st.pop() + st.pop());
            } else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            } else if(s.equals("*")){
                st.push(st.pop()*st.pop());
            } else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a/b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
