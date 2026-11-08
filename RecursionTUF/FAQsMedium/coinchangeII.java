package RecursionTUF.FAQsMedium;

public class coinchangeII {
    public static void main(String[] args) {
        
    }
    public static int coinII(int amount, int[] coins){
        int i = 0;
        int ans = solve(amount, coins, i);
        return ans;
    }
    public static int solve(int amount, int[] coins, int i){
        if(amount == 0) return 1;
        if(amount < 0) return 0;
        if(i >= coins.length) return 0;
        
        int inc = solve(amount-coins[i], coins, i);
        int exc = solve(amount, coins, i+1);
        int ans = inc + exc;
        return ans;
    }
}
