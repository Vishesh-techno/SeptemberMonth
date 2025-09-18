public class EighteenSeptember {

    public static int strStr(String hayStack, String needle) {

        if (hayStack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < hayStack.length(); i++) {
            int j = 0;
            while (j < needle.length() && (i + j) < hayStack.length()) {
                if (needle.charAt(j) != hayStack.charAt(i + j)) {
                    break;
                }
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hayStack = "Vishesh";
        String needle = "esh";

        System.out.println(strStr(hayStack, needle));
    }
}
