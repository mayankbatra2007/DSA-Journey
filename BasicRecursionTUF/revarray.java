package BasicRecursionTUF;

public class revarray {
    public static void main(String[] args) {
        
    }
    public int[] reverseArray(int[] nums) {
        //your code goes here
        int s = 0;
        int e = nums.length-1;
        int[] a = rev(nums, s, e);
        return a;
    }
    public int[] rev(int[] nums, int s, int e){
        if(s >= e) return nums;
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
        return rev(nums, s+1, e-1);
    }
}
