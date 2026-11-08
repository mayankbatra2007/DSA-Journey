package ArraysTUF.Fundamentals;

public class secondlargest {
    public static void main(String[] args) {
        
    }
    public int secondLargestElement(int[] nums){
        int sec = Integer.MIN_VALUE;
        int lar = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > lar){
                sec = lar;
                lar = nums[i];
            }
            else if(sec < nums[i] && nums[i] != lar){
                sec = nums[i];
            }
        }
        if(sec == Integer.MIN_VALUE) return -1;
        return sec;
    }
}
