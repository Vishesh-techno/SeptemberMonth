import java.util.Arrays;

public class TwentySevenSeptember {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m + n];
        for (int i = 0; i < m; i++) {
            sorted[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            sorted[m + i] = nums2[i];
        }

//      Counting sort

//        int largest = Integer.MIN_VALUE;
//        for (int i = 0; i < sorted.length; i++) {
//            largest = Math.max(largest, sorted[i]);
//        }
//
//        int[] count = new int[largest + 1];
//        for (int i = 0; i < sorted.length; i++) {
//            count[sorted[i]]++;
//        }
//
//        int j = 0;
//        for (int i = 0; i < count.length; i++) {
//            while (count[i] > 0) {
//                sorted[j] = i;
//                j++;
//                count[i]--;
//            }
//        }

//        Selection Sort
//        for (int i = 0; i < sorted.length - 1; i++) {
//            int maxIndex = i;
//            for (int j = i+1; j < sorted.length; j++) {
//                if (sorted[j] < sorted[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//            int temp = sorted[i];
//            sorted[i] = sorted[maxIndex];
//            sorted[maxIndex] = temp;
//        }

//        Insertion Sort

        for (int i = 1; i < sorted.length - 1; i++) {
            int curr = sorted[i];
            int prev = i - 1;

            while (prev >= 0 && sorted[prev] > curr) {
                sorted[prev + 1] = sorted[prev];
                prev--;
            }
            sorted[prev + 1] = curr;
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted[i];
        }
    }

    public static int majorityElements(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 0, 0, 0};

        int[] nums2 = {1, 5, 6};

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));

        System.out.println(majorityElements(nums1));
    }
}
