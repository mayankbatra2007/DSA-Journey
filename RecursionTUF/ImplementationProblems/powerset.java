package RecursionTUF.ImplementationProblems;

import java.util.ArrayList;
import java.util.List;

public class powerset {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solveSubSets(nums, 0, ans, curr);
        return ans;
    }
    public void solveSubSets(int[] nums, int i, List<List<Integer>> ans, List<Integer> curr){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        // choice add YES
        curr.add(nums[i]);
        solveSubSets(nums, i+1, ans, curr);
        curr.remove(curr.size()-1);
        solveSubSets(nums, i+1, ans, curr);
    }
}
