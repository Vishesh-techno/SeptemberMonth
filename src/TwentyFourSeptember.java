import java.util.HashSet;
import java.util.Set;

public class TwentyFourSeptember {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        Set<char[]> set = new HashSet<>();
        int count = 0;
        for(char chs=0; chs<ch.length; chs++){
            if(set.contains(chs)){
                set.add(ch);
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        String s = "abcabcbb";

        System.out.println(findPeakElement(nums));

        System.out.println(lengthOfLongestSubstring(s));
    }
}
