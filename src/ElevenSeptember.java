import java.util.Arrays;

public class ElevenSeptember {
    public static int removeDuplicates(int[] nums){
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;

            }
        }
        return k;
    }

    public static void rotateArray(int[] nums, int k){
        k = k % nums.length;
        revNumber(nums, 0, nums.length-1);
        revNumber(nums, 0, k-1);
        revNumber(nums, k, nums.length-1);
    }

    public static void revNumber(int[] nums, int start, int end){
        while (start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,7,5,8};

        System.out.println(removeDuplicates(nums));

        rotateArray(nums, 4);

        System.out.println(Arrays.toString(nums));
    }
}
