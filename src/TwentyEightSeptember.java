import java.util.Arrays;
import java.util.Scanner;

public class TwentyEightSeptember {
    public static String reverseString(String str) {
//        char[] ch = str.toCharArray();
//        int left = 0;
//        int right = ch.length - 1;
//
//        while (left <= right) {
//            char temp = ch[right];
//            ch[right] = ch[left];
//            ch[left] = temp;
//            left++;
//            right--;
//        }
//        return new String(ch);

        String result = "";
        for (int i = str.length() - 1; i > 0; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            if (ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static boolean primeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return true;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return true;
            }
        }
        return true;
    }

    public static void swapNumber(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static int countCharacter(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for (char c : ch) {
            count++;
        }
        return count;

//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//        return count;
    }

    public static boolean armstrongNumber(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        return temp == sum;
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
        return nums;
    }

    public static int[] countSort(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i : nums) {
            largest = Math.max(i, largest);
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            if (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        String str = "Interview";

        System.out.println(reverseString(str));

        System.out.println(isPalindrome(str));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. for factorial : ");

        int n = sc.nextInt();

        System.out.println(factorial(n));

        fibonacciSeries(n);

        System.out.println();

        int[] arr = {12, 45, 7, 89, 34, 67};

        System.out.println(largestElement(arr));

        System.out.println(primeNumber(n));

        swapNumber(1, 2);

        System.out.println(countCharacter(str));

        System.out.println(armstrongNumber(154));

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseArray(arr)));

        System.out.println(sumArray(arr));

        System.out.println(Arrays.toString(bubbleSort(arr)));

        System.out.println(Arrays.toString(selectionSort(arr)));

        System.out.println(Arrays.toString(insertionSort(arr)));

        System.out.println(Arrays.toString(countSort(arr)));
    }
}
