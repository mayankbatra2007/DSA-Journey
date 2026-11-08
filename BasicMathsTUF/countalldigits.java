package BasicMathsTUF;
// You are given an integer n. You need to return the number of digits in the number

public class countalldigits {
    public static void main(String[] args) {
        System.out.println(countAllDigits(123));
    }
    public static int countAllDigits(int n){
        if(n == 0) return 1;

        int c = 0;
        while(n != 0){
            //int d = n % 10;
            n /= 10;
            c++;
        }
        return c;
    }
}
