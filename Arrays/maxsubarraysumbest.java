package Arrays;
// Kadanes Algo
public class maxsubarraysumbest {
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySumKadanes(nums);
    }
    public static void maxSubArraySumKadanes(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("MaxSum: "+ maxSum);
    }
}

// Brute Force
// "What are all possible subarrays?"
// Better Brute
// "When j moves, why calculate the sum again?"
// Kadane
// Now ask the biggest question:
// "Do I even need to check every subarray?"
// No.
// At every element:
// Continue previous subarray
//           OR
// Start new subarray