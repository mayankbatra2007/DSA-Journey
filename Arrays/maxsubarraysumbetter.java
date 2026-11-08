package Arrays;
// Prefix sum -> prefix[e] - prefix[s-1]
public class maxsubarraysumbetter {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        maxSubArraySumPrefixSum(nums);
    }
    public static void maxSubArraySumPrefixSum(int[] nums){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];

        // calculate prefix array
        prefix[0] = nums[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maxsum :"+ maxSum);
    }
}
