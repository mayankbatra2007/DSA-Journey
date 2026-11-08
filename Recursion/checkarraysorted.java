package Recursion;

public class checkarraysorted {
    public static void main(String[] args) {
        
    }
    public static boolean isSortedIterative(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedRec(int[] nums, int i){
        if(i == nums.length-1){ // Base Case
            return true;
        }
        if(nums[i] > nums[i+1]){ // Processing
            return false;
        }
        return isSortedRec(nums, i+1); // Rec call
    }
}

// tc -> O(N)
// sc -> O(N)


// isSortedRec(nums, 0)  → checks 1 > 2? No
//         |
// isSortedRec(nums, 1)  → checks 2 > 3? No
//         |
// isSortedRec(nums, 2)  → checks 3 > 4? No
//         |
// isSortedRec(nums, 3)  → checks 4 > 5? No
//         |
// isSortedRec(nums, 4)  → Base Case: return true

// isSortedRec(nums, 4) → true
//         ↑
// isSortedRec(nums, 3) → true
//         ↑
// isSortedRec(nums, 2) → true
//         ↑
// isSortedRec(nums, 1) → true
//         ↑
// isSortedRec(nums, 0) → true