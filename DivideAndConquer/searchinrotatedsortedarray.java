package DivideAndConquer;

public class searchinrotatedsortedarray {
    public static void main(String[] args) {
        
    }
    public static int SearchRotatedSorted(int[] nums, int target, int si, int ei){
        if(si > ei) return -1;
        // kaam
        int mid = si + (ei-si)/2;
        // case Found
        if(nums[mid] == target){
            return mid;
        }
        // mid on L1
        if(nums[si] <= nums[mid]){
            // case a: left
            if(nums[si] <= target && target <= nums[mid]){
                return SearchRotatedSorted(nums, target, si, mid-1);
            }
            else{
                // case b: right
                return SearchRotatedSorted(nums, target, mid+1, ei);
            }
        }
        // mid on L2
        else{
            // case c: right
            if(nums[mid] <= target && target <= nums[ei]){
                return SearchRotatedSorted(nums, target, mid+1, ei);
            }
            else{
                // case d : left
                return SearchRotatedSorted(nums, target, si, mid-1);
            }
        }
    }
}
