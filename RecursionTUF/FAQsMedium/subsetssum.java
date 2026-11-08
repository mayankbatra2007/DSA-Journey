package RecursionTUF.FAQsMedium;

import java.util.ArrayList;
import java.util.List;

public class subsetssum {
    public static void main(String[] args) {
        
    }
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        findSum(nums, 0, 0, ans);
        return ans;
    }
    public void findSum(int[] nums, int i, int sum, List<Integer> ans){
        // bc
        if(i == nums.length){
            ans.add(sum);
            return;
        }
        findSum(nums, i+1, sum + nums[i], ans);
        findSum(nums, i+1, sum, ans);
    }
}