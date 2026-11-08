package Arrays;

public class sumofallsubarray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        sumOfAllSubarray(nums);
    }
    public static void sumOfAllSubarray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int s = 0;
                for(int k = i; k <= j; k++){
                    s +=  nums[k];
                    System.out.print(nums[k]+ " ");
                }
                System.out.println("sum: "+ s); 
            }
            System.out.println();
        }
    }
}
