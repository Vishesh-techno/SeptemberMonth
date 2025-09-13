public class ThirteenSeptember {
    public static int findPivotIndex(int[] nums){
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        for(int num: nums){
            if(leftSum == rightSum - num){
                return num;
            }

            leftSum = leftSum + num;
            rightSum = rightSum - num;
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] nums = {1,7,3,9,6,5,6};


        System.out.println(findPivotIndex(nums));
    }
}
