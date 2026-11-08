package ArraysTUF.LogicBuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatefromsortedarray {
    public static void main(String[] args) {
        
    }
    public int removeDuplicatesBrute(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int i = 0;
        for(int n : set){
            nums[i++] = n;
        }
        return set.size();
    } // tc -> O(N) sc -> O(N)
    public int removeDuplicatesTwoPointer(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
