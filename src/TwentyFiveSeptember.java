public class TwentyFiveSeptember {
    public static void sortColors(int[] colour){
        for(int i=0; i<colour.length-1; i++){
            int min = i;
            for(int j=i+1; j<colour.length; j++){
                if(colour[min] > colour[j]){
                    min = j;
                }
            }
            int temp = colour[min];
            colour[min] = colour[i];
            colour[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + "==>");
        }
        System.out.println("null");
    }
}
