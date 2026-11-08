package RecursionTUF.FAQsMedium;
import java.util.*;
public class combinationsumIII {
    public static void main(String args[]){

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        //your code goes here
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> output = new ArrayList<>();
         int idx = 0;
         int target = n;
         int count = 0;
         int[] candidates = {1,2,3,4,5,6,7,8,9};
         solve(candidates, target, idx, ans, output, count, k);
         return ans;
    }
    // public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    //     //your code goes here
    //     List<List<Integer>> ans = new ArrayList<>();
    //     List<Integer> output = new ArrayList<>();
    //     int idx = 0;
    //     solve(candidates, target, idx, ans, output);
    //     return ans;
    // }
    public static void solve(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> output, int count, int k){
        if(count > k) return;
        if(count == k && target == 0){
            // ans.add(new ArrayList(output));
            return;
        }
        if(idx >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        // Arrays.sort(candidates);
        output.add(candidates[idx]);
        solve(candidates, target-candidates[idx], idx+1, ans, output, count+1, k);
        output.remove(output.size()-1);
        while(idx + 1 < candidates.length && candidates[idx] == candidates[idx+1]){
            idx++;
        }
        solve(candidates, target, idx+1, ans, output, count, k);
    }
}