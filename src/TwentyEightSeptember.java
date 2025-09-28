public class TwentyEightSeptember {
    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left <= right) {
            char temp = ch[right];
            ch[right] = ch[left];
            ch[left] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "Interview";

        System.out.println(reverseString(str));
    }
}
