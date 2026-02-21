package Tree;

import java.util.ArrayList;
import java.util.List;

public class PeakElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,3};
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                list.add(nums[i]);
            }
        }

        System.out.println("Peak elements: " + list);
    }
}
