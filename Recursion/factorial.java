package Recursion;

public class factorial {
    public static void main(String[] args) {
        
    }
    public static int FactorialIterations(int n){
        int f = 1;
        for(int i = 2; i <= n; i++){
            f *= i;
        }
        return f;
    }
    public static int FactorialRec(int n){
        if(n == 0 || n == 1){ // Base case
            return 1;
        }
        return n * FactorialRec(n-1); // Processing + Recursive call
    }
} // tc -> O(N), sc -> O(N)

        // CALL STACK (FACTORIAL RECURSION)

        // FactorialRec(5)
        //       |
        //       v
        // FactorialRec(4)
        //       |
        //       v
        // FactorialRec(3)
        //       |
        //       v
        // FactorialRec(2)
        //       |
        //       v
        // FactorialRec(1)  --> Base Case returns 1


        // STACK UNWINDING (RETURNING)

        // FactorialRec(1) = 1
        //       |
        //       v
        // FactorialRec(2) = 2 * 1 = 2
        //       |
        //       v
        // FactorialRec(3) = 3 * 2 = 6
        //       |
        //       v
        // FactorialRec(4) = 4 * 6 = 24
        //       |
        //       v
        // FactorialRec(5) = 5 * 24 = 120


        // FINAL ANSWER = 120