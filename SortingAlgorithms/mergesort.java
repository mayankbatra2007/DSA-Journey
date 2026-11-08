package SortingAlgorithms;

public class mergesort {
    public static void main(String[] args) {
        
    }
    public static void MergeSort(int[] nums, int si, int ei){
        if(si >= ei) return;
        // kaam
        int mid = si + (ei-si)/2;
        MergeSort(nums, si, mid); // left
        MergeSort(nums, mid+1, ei); // right
        merge(nums, si, mid, ei);
    }
    public static void merge(int[] nums, int si, int mid , int ei){
        int[] temp = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for rigth part
        int k = 0; // iterator for temp arr

        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
                k++;
            }
            else{
                temp[k] = nums[j];
                j++;
                k++;
            }
        }
        // left me kuch bach h
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        // right me kuch bacha h
        while(j <= ei){
            temp[k++] = nums[j++];
        }
        // copy temp to nums
        for(k = 0, i=si; k < temp.length; k++,i++){
            nums[i] = temp[k];
        }
    }
}
