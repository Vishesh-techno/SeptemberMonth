import java.util.Arrays;

public class TwentyTwoSeptemberSecondPart {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int[] searchRangeFirstAndLastPosition(int[] nums, int target) {
        int[] result = {-1, -1};
        int first = search(nums, target, true);
        int second = search(nums, target, false);

        result[0] = first;
        result[1] = second;

        return result;
    }

    public static int search(int[] nums, int target, boolean isLeft) {

        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;

                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }


    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 5, 5, 9, 12};

        System.out.println(search(nums, 12));

        System.out.println(Arrays.toString(searchRangeFirstAndLastPosition(nums, 5)));
    }
}
