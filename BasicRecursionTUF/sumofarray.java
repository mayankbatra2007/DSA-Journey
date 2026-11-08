package BasicRecursionTUF;

public class sumofarray {
    public static void main(String[] args) {
        
    }
    public int arraySum(int[] nums) {
        //your code goes here
        int s = sum(nums, 0);
        return s;
    }
    public int sum(int[] nums, int i){
        if(i == nums.length) return 0;
        return nums[i] + sum(nums, i+1);
    }
}
