package Arrays.PS;
// Find mid → find sorted half → check target in sorted half → eliminate the other half.
public class targetinrotatedsortedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int i = findTargetInRotatedSortedArray(nums, 0);
        System.out.println(i);
    }
    public static int findTargetInRotatedSortedArray(int[] nums, int target){
        int n  = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            // left sorted
            if(nums[low] <= nums[mid]){
                // target exists
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{ // right sorted
                // target exists
                if(nums[high] >= target && nums[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
