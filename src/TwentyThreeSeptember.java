public class TwentyThreeSeptember {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1, end = x;
        int result = 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            long sqr = (long) mid * mid;

            if (sqr == x) {
                return mid;
            } else if (sqr > x) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

    static int picked = 45;

    public static int guess(int num) {
        if (num == picked) {
            return 0;
        } else if (num < picked) {
            return 1;
        } else {
            return -1;
        }
    }


    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }

        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(mySqrt(8));

        System.out.println(guessNumber(45));

    }
}
