package Striver_A2Z.Step_7_Lec1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> st){
        Queue<Integer> que = new ArrayDeque<>();
        for(int i=0;i<st.size();i++){
            que.add(st.pop());
        }
        while (que.isEmpty()){
            st.push(que.poll());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int k = sc.nextInt();

        for(int i=0;i<k;i++){
            st.push(sc.nextInt());
        }
        reverseStack(st);
        for(int i=0;i<st.size();i++){
            System.out.print(st.pop()+" ");
        }
    }
}
