package ArraysTUF.Fundamentals;

public class largestelement {
    public static void main(String[] args) {
        
    }
    public int largestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
}
