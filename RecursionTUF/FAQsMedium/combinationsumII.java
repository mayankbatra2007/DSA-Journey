package RecursionTUF.FAQsMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class combinationsumII {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> combinationSumII(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        solve(candidates, target, idx, ans, output);
        return ans;
    }
    public static void solve(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> output){
        if(target == 0){
            // ans.add(new ArrayList(output));
            return;
        }
        if(idx >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        Arrays.sort(candidates);
        output.add(candidates[idx]);
        solve(candidates, target-candidates[idx], idx+1, ans, output);
        output.remove(output.size()-1);
        while(idx + 1 < candidates.length && candidates[idx] == candidates[idx+1]){
            idx++;
        }
        solve(candidates, target, idx+1, ans, output);
    }

}
