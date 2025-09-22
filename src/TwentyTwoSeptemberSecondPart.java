public class TwentyTwoSeptemberSecondPart {

    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }


    public static int[] searchRangeFirstAndLastPosition(int[] nums, int target){

    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};

        System.out.println(search(nums, 12));

    }
}
