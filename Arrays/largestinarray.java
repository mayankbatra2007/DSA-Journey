package Arrays;

public class largestinarray {
    public static void main(String[] args) {
        int nums[] = {23,545,686,23,686};
        int maxi = largestInArray(nums);
        System.out.println(maxi);
    }
    public static int largestInArray(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
