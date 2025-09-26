public class Sorting {
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void countingSort(int[] nums) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(nums[i], largest);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 1, 3, 2, 6};
        int[] arr2 = {5, 4, 1, 3, 2, 6};
        int[] arr3 = {5, 4, 1, 3, 2, 6};
        int[] arr4 = {5, 4, 1, 3, 2, 6};

        insertionSort(arr1);
        printArray(arr1);

        bubbleSort(arr2);
        printArray(arr2);

        selectionSort(arr3);
        printArray(arr3);

        countingSort(arr4);
        printArray(arr4);
    }
}
