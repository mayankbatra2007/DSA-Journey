package RecursionTUF.FAQsMedium;

import java.util.ArrayList;
import java.util.List;

public class subSets {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        findSubsets(nums, 0, curr, ans);
        return ans;
    }
    public void findSubsets(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        findSubsets(nums, i+1, curr, ans);
        curr.remove(curr.size()-1);
        findSubsets(nums, i+1, curr, ans);
    }
}