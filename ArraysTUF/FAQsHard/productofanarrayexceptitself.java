package ArraysTUF.FAQsHard;

public class productofanarrayexceptitself {
    public static void main(String args[]){

    }
    public static int[] productOfArrayExceptItselfBrute(int[] nums){
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
    public static int[] productOfArrayExceptItselfoptimal(int[] nums){
        int ans[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i = nums.length-2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
    public static int[] productOfArrayExceptItselfOptimalAdv(int[] nums){
        int ans[] = new int[nums.length];

        ans[0] = 1;

        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i = nums.length-1; i >= 0; i--){
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}
