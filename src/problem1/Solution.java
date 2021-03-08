package problem1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static boolean doesItAddUpTo(List<Integer> nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (Integer num : nums) {
            if (seen.contains(k - num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(10, 15, 3, 7);
        int k = 17;
        boolean result = doesItAddUpTo(inputs, k);
        System.out.println(result);
    }
}
