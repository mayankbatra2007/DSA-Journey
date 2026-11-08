package ArraysTUF.FAQsMedium;

import java.util.Arrays;
import java.util.HashMap;
public class twosum {
    public static void main(String[] args) {

    }

    public int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public int[] twoSumBetter(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { nums[left], nums[right] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    } // do not return actual indices
    public int[] twoSumOptimal(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int first = nums[i];
            int second = target - first;
            if(map.containsKey(second)){
                return new int[]{map.get(second), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
