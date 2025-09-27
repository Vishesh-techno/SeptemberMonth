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

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < sorted.length; i++) {
            largest = Math.max(largest, sorted[i]);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < sorted.length; i++) {
            count[sorted[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sorted[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};

        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
