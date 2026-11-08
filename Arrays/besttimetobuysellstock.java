package Arrays;

public class besttimetobuysellstock {
    public static void main(String[] args) {
        
    }
    public static int bestTimeToBuySell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =  0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
// The key transition is: 
// stop checking every pair 
// and keep the best buying price seen so far.
// Brute Force — Try Every Buy/Sell
// prices = [7, 1, 5, 3, 6, 4]

// When we're at:
// 6

// Do we really need to try buying at:
// 7, 1, 5, 3

// individually?
// We only care about:
// What is the minimum price I have seen before today?

// "When I'm at today's price, what information from the past do I actually need?"