import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TenSeptember {

    // Brute Force Approach
    public static int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // not found
    }

    // Optimal Approach using HashMap
    public static int[] TwoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNo = target - nums[i];

            // use Integer.valueOf for compatibility with old Java versions
            if (map.containsKey(Integer.valueOf(requiredNo))) {
                return new int[]{i, map.get(Integer.valueOf(requiredNo))};
            }

            map.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }
        return new int[]{-1, -1}; // not found
    }

    // Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4, 8, 6, 4};

        System.out.println(Arrays.toString(TwoSum(nums, 8)));         // brute force
        System.out.println(Arrays.toString(TwoSumOptimal(nums, 8)));  // optimal
        System.out.println(maxProfit(nums));                          // stock profit
    }
}
