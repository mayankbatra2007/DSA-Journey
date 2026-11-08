package ArraysTUF.FAQsMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leadersinarray {
    public static void main(String[] args) {
        
    }
    public List<Integer> leadersInArrayBrute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            boolean isLeader = true;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] <= nums[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                list.add(nums[i]);
            }
        }
        return list;
    }
    public List<Integer> leadersInArrayOptimal(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] > maxi){
                list.add(nums[i]);
            }
            maxi = Math.max(nums[i], maxi);
        }
        Collections.reverse(list);
        return list;
    }
}
