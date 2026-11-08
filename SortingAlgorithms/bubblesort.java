package SortingAlgorithms;

public class bubblesort {
    public static void main(String[] args) {
        
    }
    public int[] bubbleSort(int[] nums) {
        for(int turn = 0; turn < nums.length-1; turn++){
            for(int j = 0; j < nums.length-1-turn; j++){
                if(nums[j] > nums[j+1]){
                    // swap
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
        int ans[] = nums;
        return ans;
    }
}
// Optimization: Add a boolean swapped = false
//  at the start of each pass, set it to true whenever a swap happens, 
// and break if no swap occurred. 
// This improves the best-case time to \(O(n)\) for an already sorted array.