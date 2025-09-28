public class TwentyEightSeptember {
    public static String reverseString(String str) {
//        char[] ch = str.toCharArray();
//        int left = 0;
//        int right = ch.length - 1;
//
//        while (left <= right) {
//            char temp = ch[right];
//            ch[right] = ch[left];
//            ch[left] = temp;
//            left++;
//            right--;
//        }
//        return new String(ch);

        String result = "";
        for (int i = str.length() - 1; i > 0; i--) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            if (ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Interview";

        System.out.println(reverseString(str));

        System.out.println(isPalindrome(str));
    }
}
