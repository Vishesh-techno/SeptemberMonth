public class Sorting2 {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "==>");
        }
        System.out.println("null");
    }

    public static void countingSort(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            largest = Math.max(num, largest);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        int[] arr2 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        int[] arr3 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        int[] arr4 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        bubbleSort(arr1);
        printArray(arr1);

        selectionSort(arr2);
        printArray(arr2);

        insertionSort(arr3);
        printArray(arr3);

        countingSort(arr4);
        printArray(arr4);

    }
}
