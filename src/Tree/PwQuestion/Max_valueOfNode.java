package Tree.PwQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Max_valueOfNode {
    public static Node buildTree(Scanner sc){
        int val = sc.nextInt();
        if(val == -1) return null;

        Node root = new Node(val);
        System.out.println("Enter left child of " + val);
        root.left = buildTree(sc);
        System.out.println("Enter right child of " + val);
        root.right = buildTree(sc);

        return root;
    }
    public static int maxValue(Node root){
//        using HWI.recursion
   /*     if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    */

//        without HWI.recursion
        if(root == null) return 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int maxVal = Integer.MIN_VALUE;

        while (!que.isEmpty()){
            Node curr = que.poll();
            maxVal = Math.max(maxVal,curr.val);

            if(curr.left!=null) que.add(curr.left);
            if(curr.right!=null) que.add(curr.right);
        }
        return maxVal;
    }

    public static int minValue(Node root){
//        using HWI.recursion
        /*if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
        */

//        without HWI.recursion
        if(root == null) return Integer.MAX_VALUE;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int minVal = Integer.MAX_VALUE;

        while (!que.isEmpty()){
            Node curr = que.poll();
            minVal = Math.min(minVal, curr.val);

            if(curr.left!=null) que.add(curr.left);
            if(curr.right!=null) que.add(curr.right);
        }
        return minVal;
    }

    public static int size(Node root){
//        using HWI.recursion
        /*if(root==null) return 0;
        return 1+size(root.left)+size(root.right);*/

//        without using HWI.recursion
        if(root==null) return 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int count = 0;
        while (!que.isEmpty()){
            Node curr = que.poll();
            count++;
            if(curr.left!=null) que.add(curr.left);
            if(curr.right!=null) que.add(curr.right);
        }
        return count;
    }
    public static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Node root = buildTree(sc);
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = g ; c.right = f;
        e.right = h;
        System.out.println(maxValue(a));
        System.out.println(minValue(a));
        System.out.println(size(a));
        System.out.println(level(a));
    }
}
