import java.util.Arrays;

public class TwelveSeptember {

    public static int[] plusOne(int[] nums){
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        for(int i = nums.length-1; i>0; i--){
            if(nums[i] == 9){
                nums[i] = 0;
            }else{
                nums[i] = nums[i] + 1;
                return nums;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {9};

        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
