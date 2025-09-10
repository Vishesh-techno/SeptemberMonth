import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TenSeptember {
    public static int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] TwoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNo = target - nums[i];

            if (map.containsKey(requiredNo)) {
                return new int[]{i, map.get(requiredNo)};
            }

            map.put(nums[i], i);
        }
        return null;
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4, 8, 6, 4};

        System.out.println(Arrays.toString(TwoSum(nums, 8)));
        System.out.println(Arrays.toString(TwoSumOptimal(nums, 45)));
        System.out.println(maxProfit(nums));

    }
}
