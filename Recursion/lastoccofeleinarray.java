package Recursion;

public class lastoccofeleinarray {
    public static void main(String[] args) {

    }
    public static int LastOccIterative(int[] nums, int key) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int LastOccRecOne(int[] nums, int key, int i) {
        if (i == nums.length)
            return -1;
        int isFound = LastOccRecOne(nums, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (nums[i] == key) {
            return i;
        }
        return -1;
    } // tc -> O(N), sc -> O(N)
    
    // search from last index
    public static int LastOccRecTwo(int[] nums, int key, int i) {
        if (i < 0)
            return -1; // Base case
        if (nums[i] == key)
            return i; // Processing
        return LastOccRecTwo(nums, key, i - 1); // Rec Call
    }
}
