public class SeventeenSeptember2 {
    public static void reverseString(char[] ch){
        int start = 0;
        int end = ch.length - 1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        reverseString(s);

        System.out.println(s);
    }
}
