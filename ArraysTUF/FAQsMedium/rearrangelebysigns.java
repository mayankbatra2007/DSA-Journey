package ArraysTUF.FAQsMedium;

public class rearrangelebysigns {
    public static void main(String[] args) {
        
    }
    public int[] rearrangeArrayBrute(int[] nums) {
        int ans[] = new int[nums.length];
        int pIdx = 0, nIdx = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pIdx] = nums[i];
                pIdx += 2;
            }
            else{
                ans[nIdx] = nums[i];
                nIdx += 2;
            }
        }
        return ans;
    }
}
