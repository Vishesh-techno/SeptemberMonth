import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwelveSeptember {

    public static int[] plusOne(int[] nums) {
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 9) {
                nums[i] = 0;
            } else {
                nums[i] = nums[i] + 1;
                return nums;
            }
        }
        return result;
    }

    public static void zeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }

    public static int[] twoSum(int[] nums, int target) {
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

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int[] nums = {0};

        int[] arr = {0, 1, 0, 3, 12};

        int[] nums1 = {1, 1, 0, 1, 1, 1};

        System.out.println(Arrays.toString(plusOne(nums)));

        zeroes(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(twoSum(arr, 0)));

        System.out.println(findMaxConsecutiveOnes(nums1));
    }
}
