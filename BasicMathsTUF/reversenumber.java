package BasicMathsTUF;

public class reversenumber {
    public static void main(String[] args) {
        int r = reverseNumber(123);
        System.out.println(r);
    }
    public static int reverseNumber(int n) {
        int rev = 0;
        while(n != 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }
}
