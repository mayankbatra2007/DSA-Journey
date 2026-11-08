package BasicMathsTUF;

public class factorial {
    public static void main(String[] args) {
        int f = Factorial(5);
        System.out.println(f);
    }
    public static int Factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * Factorial(n-1);
    }
}
