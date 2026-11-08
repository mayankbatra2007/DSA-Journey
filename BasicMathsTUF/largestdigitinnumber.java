package BasicMathsTUF;

public class largestdigitinnumber {
    public static void main(String[] args) {
        int largest = largestDigit(123);
        System.out.println(largest);
    }
    public static int largestDigit(int n) {
        int l = 0;
        while(n != 0){
            int d = n % 10;
            if(d > l){
                l = d;
            }
            n /= 10;
        }
        return l;
    }
}
