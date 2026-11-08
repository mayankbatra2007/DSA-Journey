package ArraysTUF.FAQsHard;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class majorityeletwo {
    public static void main(String[] args) {
        
    }
    public List<Integer> majorityElementTwoBrute(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue;

            int c = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }

            if(c > nums.length/3){
                list.add(nums[i]);
            }
        }

        return list;
    } // tc -> O(N2) sc -> O(1)
    public List<Integer> majorityElementTwoBetter(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                list.add(entry.getKey());
            }
        }
        return list;
    } // tc -> O(N) sc -> O(N)
    // Moores voting algo
    public List<Integer> majorityElementTwoOptimal(int[] nums) {
        int n = nums.length;
        int candidate1 = 0;
        int count1 = 0;
        int candidate2 = 0;
        int count2 = 0;

        for(int num : nums){
            if(count1 == 0 && num != candidate2){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0 && num != candidate1){
                candidate2 = num;
                count2 = 1;
            }
            else if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
            else count1-- ; count2--;
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        List<Integer> list = new ArrayList<>();
        if(count1 > n/3) list.add(candidate1);
        if(count2 > n/3) list.add(candidate2);
        return list;
    }
}
// How to remember the intuition:
//  Different elements cancel each other out in groups of three. 
// Since a majority element appears more than n/3 times, 
// it can survive this cancellation process.