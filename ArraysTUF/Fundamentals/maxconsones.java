package ArraysTUF.Fundamentals;

public class maxconsones {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,0,1,1,1};
        int c = findMaxConsecutiveOnes(nums);
        System.out.println(c);
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int c = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                c++;
                max = Math.max(max, c);
            }
            else{
                c = 0;
            }
        }

        return max;
    }
}
