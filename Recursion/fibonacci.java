package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        
    }
    public static int FibonacciItertions(int n){
        int a = 0, b = 1;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a;
            int c = a + b;
            a = b;
            b = c;
        }
        return s;
    }
    public static int FibonacciRec(int n){
        if(n == 0) return 0;  // Base Case
        if(n == 1) return 1;

        return FibonacciRec(n-1) + FibonacciRec(n-2);
        // Processing + RecCall
    }
}
// tc -> O(2^N)
// sc -> O(N)

//                  FibonacciRec(4)
//                 /               \
//        FibonacciRec(3)        FibonacciRec(2)
//         /         \             /        \
//   FibRec(2)     FibRec(1)   FibRec(1)   FibRec(0)
//    /     \          |           |           |
// Fib(1) Fib(0)       1           1           0
//   |       |
//   1       0
