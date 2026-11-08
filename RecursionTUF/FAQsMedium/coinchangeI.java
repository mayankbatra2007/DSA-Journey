package RecursionTUF.FAQsMedium;

public class coinchangeI {
    public static void main(String[] args) {
        
    }
    public static int coinChangeI(int[] coins, int amount){
        int ans = solve(coins, amount);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    public static int solve(int[] coins, int amount){
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        
        int mini = Integer.MAX_VALUE;

        for(int coin : coins){
            int RecKaAns = solve(coins, amount-coin);
            if(RecKaAns != Integer.MAX_VALUE){
                int totalCoinsUsed = RecKaAns + 1;
                mini = Math.min(totalCoinsUsed, mini);
            }
        }
        return mini;
    }
}
// Try → Recursion → Add → Minimize

// - Try: Every available coin.
// - Recursion: Solve the remaining amount.
// - Add: +1 for the selected coin.
// - Minimize: Use Math.min() to find the minimum coins.
//   Pattern: Decision Making + Optimization