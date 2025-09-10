import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 4, 8, 6, 4};

        System.out.println(Arrays.toString(TwoSum(nums, 8)));

    }
}
