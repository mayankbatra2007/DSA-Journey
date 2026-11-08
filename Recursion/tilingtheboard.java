package Recursion;

public class tilingtheboard {
    public static void main(String[] args) {
        
    }
    public static int TilingProblem(int n){ // 2 x n (Board size)
        if(n == 0 || n == 1) return 1; // Base case
        // vertical choice
        int fnMinus1 = TilingProblem(n-1);
        // horizontal choice
        int fnMinus2 = TilingProblem(n-2);

        int toWays = fnMinus1 + fnMinus2;
        return toWays;
    }
}
// tc -> O(2^N), sc -> O(N)
