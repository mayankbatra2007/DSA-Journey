package ArraysTUF.FAQsHard;

import java.util.HashMap;

public class repeatingandmissing {
    public static void main(String[] args) {
        
    }
    public int[] findMissingRepeatingNumbersBrute(int[] nums) {
        int repeating = -1;
        int missing = -1;
        int n = nums.length;

        for(int i = 1; i <= n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(nums[j] == i) count++;
            }

            if(count == 2){
                repeating = i;
            }
            else if(count == 0){
                missing = i;
            }
        }
        return new int[]{repeating, missing};
    } // tc -> O(N2) sc -> O(1)
    public int[] findMissingRepeatingNumbersBetter(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int repeating = -1;
        int missing = -1;

        for(int i = 1; i <= nums.length; i++){
            int count = map.getOrDefault(i, 0);
            if(count == 2){
                repeating = i;
            }
            else if(count == 0){
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    } // tc -> O(N) sc -> O(N)
    public int[] findMissingRepeatingNumbersOptimal(int[] nums) {
        long n = nums.length;
        long expectedSum = n * (n+1)/2;
        long expectedSqSum = n * (n+1) * (2*n+1) / 6;

        long actualSum = 0;
        long actualSqSum = 0;

        for(int num : nums){
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long diff = actualSum - expectedSum;
        long sqDiff = actualSqSum - expectedSqSum;

        long sum = sqDiff / diff;

        long repeating = (diff + sum) / 2;
        long missing = repeating - diff;

        return new int[]{(int) repeating, (int) missing};
    } // ct -> O(N) sc -> O(1)
}
