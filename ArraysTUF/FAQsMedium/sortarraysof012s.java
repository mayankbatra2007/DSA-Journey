package ArraysTUF.FAQsMedium;

import java.util.Arrays;

public class sortarraysof012s {
    public static void main(String[] args) {
        
    }
    public void sortZeroOneTwoBrute(int[] nums) {
        Arrays.sort(nums);
    } // tc -> O(N log N)
    public void sortZeroOneTwoBetter(int[] nums) {
        int c_z = 0, c_o = 0, c_t = 0;
        for(int num : nums){
            if(num == 0) c_z++;
            else if(num == 1) c_o++;
            else c_t++;
        }
        int idx = 0;
        while(c_z > 0){
            nums[idx++] = 0;
            c_z--;
        }
        while(c_o > 0){
            nums[idx++] = 1;
            c_o--;
        }
        while(c_t > 0){
            nums[idx++] = 2;
            c_t--;
        }
    } // tc -> O(N)
    public void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int t = nums[mid];
                nums[mid] = nums[low];
                nums[low] = t;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int t = nums[mid];
                nums[mid] = nums[high];
                nums[high] = t;
                high--;
            }
        }
    } // one pass algo -> DNF
}
