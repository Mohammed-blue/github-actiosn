package tech.strategio;

import java.util.*;

public class E01 {
    /**
     * Given an array of integers, check if there are any
     * duplicate integers in the array.
     * See the README.md file for more information.
     *
     * @param nums An array of integers
     * @return A boolean on whether there are duplicates
     */
    public boolean containsDuplicate(int[] nums) {
        // @TODO: Write out the method
        // This takes O(N^2) quadric time, at the cost of a constant space.
//        if (nums.length < 2) {
//            return false;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;

        //  Hash Set. The complexity will be O(N) as we only need to conduct a linear scan. However, the space
        //  requirement is O(N) as we are using a Hash Set that complexity grows linear with the data set.
        Set<Integer> set = new HashSet<>();
        for (Integer x : nums) {
            if (set.contains(x)) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
