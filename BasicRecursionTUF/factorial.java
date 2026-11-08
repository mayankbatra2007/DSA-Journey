package BasicRecursionTUF;

public class factorial {
    public static void main(String[] args) {
        
    }
    public long Factorial(int n) {
        //your code goes here
        if(n == 0 || n == 1) return 1;
        return n * Factorial(n-1);
    }
}
