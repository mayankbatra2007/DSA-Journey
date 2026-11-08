package RecursionTUF.ImplementationProblems;

public class climstairs {
    public static void main(String args[]){

    }
    public static int climStairs(int n){
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;

        int ans = climStairs(n-1) + climStairs(n-2);
        return ans;
    }// tc -> O(2 ^ n) sc -> O(N)
}
// logic
// You want to reach the fourth step.

// Think about the last move you make.

// There are only two possibilities:

// Case 1: You came from step 3

// You climbed 1 step.

// Case 2: You came from step 2

// You climbed 2 steps.

// Therefore:
// \[
// ways(n) = ways(n-1) + ways(n-2)
// \]