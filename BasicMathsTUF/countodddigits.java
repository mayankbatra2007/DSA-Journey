package BasicMathsTUF;

public class countodddigits {
    public static void main(String[] args) {
        System.out.println(countOddDigits(123));
    }
    public static int countOddDigits(int n){
        int c = 0;

        while(n != 0){
            int d = n %  10;
            if(d % 2 != 0){
                c++;
            }
            n /= 10;
        }

        return c;
    }
}
