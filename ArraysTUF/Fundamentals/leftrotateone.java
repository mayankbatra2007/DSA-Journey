package ArraysTUF.Fundamentals;

public class leftrotateone {
    public static void main(String[] args) {
        
    }
    public static void rotateArrayByOne(int[] nums) {
        int f = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = f;
    }
}
