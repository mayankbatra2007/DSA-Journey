package BasicRecursionTUF;

public class fibonacci {
    public static void main(String[] args) {
        
    }
    public int fib(int n) {
        //your code goes here
        if(n == 0) return 0;
        if(n == 1  || n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }
}
