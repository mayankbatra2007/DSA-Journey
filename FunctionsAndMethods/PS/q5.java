package FunctionsAndMethods.PS;
// Write a Java method to compute the sum of the digits in an intege
public class q5 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(100));
    }
    public static int sumOfDigits(int n) {
        int sum = 0;

        while(n  != 0){
            int d = n % 10;
            sum += d;
            n /= 10;
        }

        return sum;
    }
}
