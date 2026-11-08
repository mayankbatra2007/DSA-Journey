package Arrays;

public class pairsinarray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        pairsArray(nums);
    }
    public static void pairsArray(int nums[]){
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            for(int j = i+1; j < nums.length; j++){
                System.out.println("Pair "+ curr + "-"+ nums[j]);
            }
            System.out.println();
        }
    }
}
