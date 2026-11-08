package Backtracking;

public class arraybacktrack {
    public static void main(String[] args) {
        int nums[] = new int[5];
        changeArr(nums, 0, 1);
        printArr(nums);
    }
    public static void changeArr(int[] nums, int i, int val){
        // base case
        if(i == nums.length){
            printArr(nums);
            return;
        }
        // recursion
        nums[i] = val;
        changeArr(nums, i+1, val+1); // call
        // jab call stack me se vapas hogi
        nums[i] = nums[i] - 2; // backtrack step
    } // tc -> O(N) sc -> O(N)
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
