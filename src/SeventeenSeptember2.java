public class SeventeenSeptember2 {
    public static void reverseString(char[] ch) {
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    public static int reverseInt(int x) {
        long rev = 0;
        while (x != 0) {
            int last = x % 10;
            rev = rev * 10 + last;
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) rev;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        String s1 = "anagram";

        String t = "nagaram";

        int x = 1534236469;

        reverseString(s);

        System.out.println(s);

        System.out.println(reverseInt(x));

        System.out.println(isAnagram(s1, t));

    }
}
