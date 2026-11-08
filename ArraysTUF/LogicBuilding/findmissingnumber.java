package ArraysTUF.LogicBuilding;

public class findmissingnumber {
    public static void main(String[] args) {
        
    }
     public int missingNumberBrute(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            boolean isFound = false;
            for(int j = 0; j <= n-1; j++){
                if(i == nums[j]){ 
                    isFound = true;
                    break;
                }
            }
            if(isFound == false){
                return i;
            }
        }
        return -1;
    } // tc -> O(N) sc -> O(N)
    public int missingNumberXOR(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            xor ^= i;
        }
        for(int i = 0; i <= n-1; i++){
            xor ^= nums[i];
        }
        return xor;
    } // tc -> O(N) sc -> o(1)
}
