public class TwentyThreeSeptember {
    public static int mySqrt(int x){
        if(x == 0){
            return 0;
        }
        int start = 1, end = x;
        int result = 1;
        while(start <= end){
            int mid = start + (end-start)/2;

            long sqr = (long) mid * mid;

            if (sqr == x) {
                return mid;
            }else if(sqr > x){
                end = mid - 1;
            }else{
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(mySqrt(8));

    }
}
