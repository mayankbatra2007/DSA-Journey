package ArraysTUF.FAQsMedium;

import java.util.*;
public class threesum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSumBrute(int[] nums){
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    } // tc -> O(N) and sc -> O(K) k -> no of triplets
    public List<List<Integer>> threeSumBetter(int[] nums){
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int target = -nums[i];
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j < nums.length; j++){
                int third = target - nums[j];
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    } // hashing
    public List<List<Integer>> threeSumTwoPointer(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
}
    //             3Sum
    //               │
    //               ↓
    //     Try every 3 numbers
    //               │
    //            O(N³)
    //               │
    //               ↓
    //     Fix one number
    //               │
    //               ↓
    //       Remaining = 2Sum
    //               │
    //               ↓
    //          HashSet
    //               │
    //            O(N²)
    //               │
    //               ↓
    //    Can sorting help us?
    //               │
    //               ↓
    //       Sorted + 2 pointers
    //               │
    //            O(N²)

//     Why am I using HashSet?

// The HashSet is helping me quickly find the required number.
// But if I sort the array, I get something even more useful:
// [-4, -1, -1, 0, 1, 2]

// Now I can use two pointers.