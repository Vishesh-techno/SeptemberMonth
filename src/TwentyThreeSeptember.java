public class TwentyThreeSeptember {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1, end = x;
        int result = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            long sqr = (long) mid * mid;

            if (sqr == x) {
                return mid;
            } else if (sqr > x) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

    static int picked = 45;

    public static int guess(int num) {
        if (num == picked) {
            return 0;
        } else if (num < picked) {
            return 1;
        } else {
            return -1;
        }
    }


    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }

        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInRotatedArray(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findMinInRotatedArray(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[start] > nums[mid] && nums[mid] < nums[end]) {
                return mid;
            }

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(mySqrt(8));

        System.out.println(guessNumber(45));

        System.out.println(searchInRotatedArray(nums, 0));

        System.out.println(findMinInRotatedArray(nums));


    }
}
