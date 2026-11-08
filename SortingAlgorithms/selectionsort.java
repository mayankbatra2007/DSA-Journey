package SortingAlgorithms;

public class selectionsort {
    public static void main(String[] args) {
        
    }
    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int t = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = t;
        }
        return nums;
    }
}
