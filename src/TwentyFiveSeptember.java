public class TwentyFiveSeptember {
    public static void sortColors(int[] colour) {
        for (int i = 0; i < colour.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < colour.length; j++) {
                if (colour[min] > colour[j]) {
                    min = j;
                }
            }
            int temp = colour[min];
            colour[min] = colour[i];
            colour[i] = temp;
        }
    }

    public static int heightChecker(int[] heights) {
        int[] expectedHeight = new int[heights.length];
        for (int i = 0; i < expectedHeight.length; i++) {
            expectedHeight[i] = heights[i];
        }

        int count = 0;
        for (int i = 0; i < expectedHeight.length - 1; i++) {
            int minheight = i;
            for (int j = i + 1; j < expectedHeight.length; j++) {
                if (expectedHeight[minheight] > expectedHeight[j]) {
                    minheight = j;
                }
            }
            int temp = expectedHeight[minheight];
            expectedHeight[minheight] = expectedHeight[i];
            expectedHeight[i] = temp;
        }

        for (int i = 0; i < expectedHeight.length; i++) {
            if (expectedHeight[i] != heights[i])
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        int[] height = {5, 1, 2, 3, 4};

        for (int num : nums) {
            System.out.print(num + "==>");
        }
        System.out.println("null");

        System.out.println(heightChecker(height));

    }
}
