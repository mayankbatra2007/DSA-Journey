package Arrays;

public class subarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        subArray(nums);
    }
    public static void subArray(int nums[]){
        for(int i = 0; i < nums.length; i++){
            int s = i;
            for(int j = i; j < nums.length; j++){
                int e = j;
                for(int k = s; k <= e; k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
