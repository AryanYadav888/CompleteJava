package leetcode.Quest.DSA.Array2;

import java.util.*;

public class DisappearedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        findDisappearedNumbers(arr);
    }

    private static void findDisappearedNumbers(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=1;i<=arr.length;i++){
            hm.put(i,0);
        }

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }

        List<Integer> lst = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 0) lst.add(entry.getKey());
        }

        for(int i : lst){
            System.out.print(i);
        }
    }
}
