package Recursion;

public class powerxton {
    public static void main(String[] args) {
        
    }
    public static int PowerRec(int x, int n){
        if(n == 0){ // Base Case
            return 1;
        }
        return x * PowerRec(x, n-1);
        // Processing + Rec call
    }// tc -> O(N) , sc -> O(N)
    public static int PowerRecOptimal(int x, int n){
        if(n == 0) return 1;
        // int halfPowersq = PowerRecOptimal(x, n/2) * PowerRecOptimal(x, n/2); -> tc -> O(N)
        int halfPow = PowerRecOptimal(x, n/2);
        int halfPowersq = halfPow * halfPow;
        // n is odd
        if(n % 2 != 0){
            halfPowersq = x * halfPowersq;
        } 
        return halfPowersq;
    }// tc -> O(log N)
}
