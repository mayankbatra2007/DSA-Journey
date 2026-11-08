package Arrays;

public class reversearray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        reverseArray(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static int[] reverseArray(int nums[]){
        int s = 0;
        int e = nums.length-1;

        while(s < e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }

        return nums;
    }
}
