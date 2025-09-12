import java.util.Arrays;

public class TwelveSeptember {

    public static int[] plusOne(int[] nums) {
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 9) {
                nums[i] = 0;
            } else {
                nums[i] = nums[i] + 1;
                return nums;
            }
        }
        return result;
    }

    public static void zeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }


    public static void main(String[] args) {
        int[] nums = {0};

        int[] arr = {0,1,0,3,12};

        System.out.println(Arrays.toString(plusOne(nums)));

        zeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
