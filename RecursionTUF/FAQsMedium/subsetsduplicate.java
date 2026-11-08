package RecursionTUF.FAQsMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsduplicate {
    public static void main(String[] args) {
        
    }
     public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int i = 0;
        solve(nums, i, ans, curr);
        return ans;
    }
    public void solve(int[] nums, int i, List<List<Integer>> ans, List<Integer> curr){
        if(i >= nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(nums, i+1, ans, curr);
        curr.remove(curr.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
        solve(nums, i+1, ans, curr);
    }
}
