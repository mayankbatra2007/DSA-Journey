package ArraysTUF.LogicBuilding;

public class movezeroestoend {
    public static void main(String[] args) {
        
    }
    public void moveZeroesBrute(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                temp[j++] = nums[i];
            }
        }
        for(int i = 0; i < temp.length; i++){
            nums[i] = temp[i];
        }
        while(j < nums.length){
            nums[j++] = 0;
        }
    } // tc -> O(N) and sc -> O(N)
    public void moveZeroesTwoPointer(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    } // tc -> O(N) sc -> O(1)
}
