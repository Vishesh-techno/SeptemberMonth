public class ThirteenSeptember {
    public static int findPivotIndex(int[] nums) {
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for (int num : nums) {
            if (leftSum == rightSum - num) {
                return num;
            }

            leftSum = leftSum + num;
            rightSum = rightSum - num;
        }
        return -1;
    }

    public static int minSubArrayLength(int[] nums, int target) {

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];

                if (sum >= target) {
                    minDistance = Math.min(minDistance, j - i + 1);
                    break;
                }
            }
        }
        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 9, 6, 5, 6};

        int[] nums1 = {3, 6, 1, 0};

        System.out.println(findPivotIndex(nums));

        System.out.println(dominantIndex(nums1));

        System.out.println(minSubArrayLength(nums, 24));

    }
}
