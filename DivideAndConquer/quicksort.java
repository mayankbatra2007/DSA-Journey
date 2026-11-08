package DivideAndConquer;

public class quicksort {
    public static void main(String[] args) {
        
    }
    public static void QuickSort(int[] nums, int si, int ei){
        if(si >= ei) return;
        // pivot ele -> last
        int pidx = partition(nums, si, ei);
        QuickSort(nums, si, pidx-1); // left
        QuickSort(nums, pidx+1, ei); // right
    }
    public static int partition(int[] nums, int si, int ei){
        int pivot = nums[ei];
        int i = si-1; // to make place for eles smaller than pivot

        for(int j = si; j < ei; j++){
            if(nums[j] <= pivot){
                i++;
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
        }
        i++;
        int t = pivot;
        nums[ei] = nums[i];
        nums[i] = t;
        return i;
    }
}
