package BasicRecursionTUF;

import java.util.ArrayList;

public class checkarraysorted {
    public static void main(String[] args) {
        
    }
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        int i = 0;
        boolean isS = issort(nums, i);
        return isS;
    }
    public boolean issort(ArrayList<Integer> nums, int i){
        if(i == nums.size()-1) return true;
        if(!(nums.get(i) <= nums.get(i+1))) return false;
        return issort(nums, i+1);
    }
}
