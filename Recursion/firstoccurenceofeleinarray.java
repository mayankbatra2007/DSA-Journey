package Recursion;

public class firstoccurenceofeleinarray {
    public static void main(String[] args) {
        
    }
    public static int FirstOccIterative(int[] nums, int key){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int FirstOccRec(int[] nums, int key, int i){
        // Base case
        if(i == nums.length){
            return -1;
        }
        // Processing
        if(nums[i] == key){
            return i;
        }
        // Rec Call
        return FirstOccRec(nums, key, i+1);
    }
}
// tc -> O(N)
// sc -> O(N)