package Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,5};
        int idx = binarySearch(nums, 5);
        System.out.println(idx);
    }
    public static int binarySearch(int nums[], int key){
        int s = 0;
        int e = nums.length-1;

        while(s <= e){
            int mid = (s+e) / 2;
            if(nums[mid] == key){
                return mid;
            } 
            if(nums[mid] < key){ // right
                s = mid + 1;
            }
            else{ // left
                e = mid - 1;
            }
        }
        return -1;
    }
}
