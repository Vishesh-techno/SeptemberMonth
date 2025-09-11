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
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,7,5,8};

        System.out.println(removeDuplicates(nums));
    }
}
