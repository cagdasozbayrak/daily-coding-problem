package problem2;

import java.util.Arrays;

public class Solution {
    public static int[] withDivision(int[] input) {
        if (input.length < 2) {
            return input;
        } else if (input.length == 2) {
            return new int[]{input[1], input[0]};
        }

        int product = 1;
        for (int i : input) {
            product *= i;
        }

        int[] result = new int[input.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = product / input[i];
        }

        return result;
    }

    public static int[] withoutDivision(int[] input) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(withDivision(new int[]{1, 2, 3, 4, 5})));
    }
}
