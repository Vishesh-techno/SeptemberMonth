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

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        int x = 1534236469;

        reverseString(s);

        System.out.println(s);

        System.out.println(reverseInt(x));
    }
}
