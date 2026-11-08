package ArraysTUF.FAQsHard;

public class maxproductsubarray {
    public static void main(String[] args) {
        
    }
    public int maxProductBrute(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = i; j < nums.length; j++){
                product *= nums[j];
                maxProduct = Math.max(product, maxProduct);
            }
        }
        return maxProduct;
    }
    public int maxProductOptimal(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;

        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}
