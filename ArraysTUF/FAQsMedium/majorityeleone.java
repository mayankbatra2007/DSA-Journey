package ArraysTUF.FAQsMedium;
import java.util.*;
public class majorityeleone {
    public static void main(String[] args) {
        
    }
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    } // tc -> O(N)
    public int majorityElementBtter(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
    // Moores voting algo
    public static int majorityElementOptimal(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
// Moore's Voting Algorithm: 
// Increase count for the candidate, 
// decrease for different elements; 
// when count becomes 0, choose a new candidate.