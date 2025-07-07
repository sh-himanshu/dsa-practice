import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

    public static void main(String[] args) {
        int[] nums = {2, 22, 11, 7};
        int target = 9;
        System.out.println(Arrays.toString(findTwoSumsByHashMaps(nums, target)));
    }

    // Brute force approach
    public static int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[]{};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Optimised approach with hashmaps
    public static int[] findTwoSumsByHashMaps(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) return new int[] {map.get(diff), i};
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}