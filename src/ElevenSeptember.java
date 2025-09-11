import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElevenSeptember {
    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        revNumber(nums, 0, nums.length - 1);
        revNumber(nums, 0, k - 1);
        revNumber(nums, k, nums.length - 1);
    }

    public static void revNumber(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for (int num : nums) {
            if (dup.contains(num)) {
                return true;
            }
            dup.add(num);
        }
        return false;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();

        for (int num : nums1) {
            n1.add(num);
        }
        for (int num : nums2) {
            n2.add(num);
        }

        int[] result = new int[Math.min(n1.size(), n2.size())];

        int k = 0;

        for (int num : n1) {
            if (n2.contains(num)) {
                result[k] = num;
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 7, 5, 8};
        int[] nums1 = {3, 4, 4, 5, 5, 8};

        int k = removeDuplicates(nums);
        System.out.println("Unique count: " + k);

        int[] unique = Arrays.copyOf(nums, k);
        rotateArray(unique, 4);
        System.out.println("Rotated array: " + Arrays.toString(unique));

        System.out.println(containsDuplicate(nums));

        System.out.println(Arrays.toString(intersection(nums, nums1)));
    }

}
