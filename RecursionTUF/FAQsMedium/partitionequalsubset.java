package RecursionTUF.FAQsMedium;

public class partitionequalsubset {
    public static void main(String args[]){

    }
    public static boolean canPartition(int nums[]){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0) return false; // sum is not divisible
        int target = sum / 2;
        int index = 0;
        boolean ans = solve(target, nums, index);
        return ans;
    }
    public static boolean solve(int target, int[] nums, int index){
        // bc
        if(target == 0) return true;
        if(target < 0) return false;
        if(index >= nums.length) return false;

        // inc / exc pattern
        boolean inc = solve(target-nums[index], nums, index+1);
        boolean exc = solve(target, nums, index+1);

        return inc || exc;
    }
}
// tc -> o(2 ^ n)
// sc -> o(n)
// at evry index two choices include that ele or exclude that ele
