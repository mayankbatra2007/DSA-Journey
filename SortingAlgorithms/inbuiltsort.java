package SortingAlgorithms;
import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2,1};

        Arrays.sort(nums);
        Arrays.sort(nums, 0,3); // nums, si, ei

        Integer[] num = {2,2,213};
        Arrays.sort(num, Collections.reverseOrder());
        Arrays.sort(num, 0, 3, Collections.reverseOrder());
    }
}
