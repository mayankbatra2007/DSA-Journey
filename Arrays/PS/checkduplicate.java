package Arrays.PS;

public class checkduplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(checkDuplicate(nums));
    }
    public static boolean checkDuplicate(int[] nums){
        boolean isAny = false;

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    isAny = true;
                    return isAny;
                }
            }
        }
        return isAny;
    }
}
