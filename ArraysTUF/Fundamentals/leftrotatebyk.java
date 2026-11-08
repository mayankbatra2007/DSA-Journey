package ArraysTUF.Fundamentals;

public class leftrotatebyk {
    public static void main(String[] args) {
        
    }
    public void rotateArrayByK(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            int f = nums[0];
            for(int j = 0; j < nums.length-1; j++){
                nums[j] = nums[j+1];
            }
            nums[nums.length-1] = f;
        }
    }
}
