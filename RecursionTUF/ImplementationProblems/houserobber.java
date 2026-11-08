package RecursionTUF.ImplementationProblems;

public class houserobber {
    public static void main(String args[]){

    }
    public static int houseRob(int[] nums){
        int i = 0;
        int ans = solve(nums, i);
        return ans;
    }
    public static int solve(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }
        // ek case solve
        // at i -> we can rob house or not
        // if we rob house at i -> then go i+2 house
        // else go -> i+1 house
        int inc = nums[i] + solve(nums, i+2);
        int exc = 0 + solve(nums, i+1);
        int ans = Math.max(inc, exc);
        return ans;
    }
}
// tc -> O(2 ^ N)