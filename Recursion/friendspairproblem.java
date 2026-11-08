package Recursion;

public class friendspairproblem {
    public static void main(String[] args) {
        
    }
    public static int FriendsPairing(int n){
        if(n == 1 || n == 2) return n;
        return FriendsPairing(n-1) + (n-1) * FriendsPairing(n-2);
    }
}
// single
        // int fnMinus1 = FriendsPairing(n-1);
        // // pair
        // int fnMinus2 = FriendsPairing(n-2);
        // int pairWays = (n-1) * fnMinus2;

        // // total ways
        // int toWays = fnMinus1 + pairWays;
        // return toWays;
