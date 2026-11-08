package ArraysTUF.LogicBuilding;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class unionoftwosortedarray {
    public static void main(String[] args) {
        
    }
    public int[] unionArrayBrute(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for(int n : nums1){
            set.add(n);
        }
        for(int n : nums2){
            set.add(n);
        }
        int[] union = new int[set.size()];
        int j = 0;
        for(int n : set){
            union[j] = n;
            j++;
        }
        return union;
    }
    // important
    public int[] unionArrayBruteTwoPointer(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans[] = new int[n1+n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                if(k == 0 || ans[k-1] != nums1[i]){
                    ans[k++] = nums1[i];
                }
                i++;
            }
            else if(nums1[i] > nums2[j]){
                if(k == 0 || ans[k-1] != nums2[j]){
                    ans[k++] = nums2[j];
                }
                j++;
            }
            else{ //  same eles
                if(k == 0 || ans[k-1] != nums1[i]){
                    ans[k++] = nums1[i];
                }
                j++;
                i++;
            }
        }
        while(i  < n1){
            if(k == 0 || ans[k-1] != nums1[i]){
                ans[k++] = nums1[i];
            }
            i++;
        }
        while(j < n2){
            if(k == 0 || ans[k-1] != nums2[j]){
                ans[k++] = nums2[j];
            }
            j++;
        }
        return Arrays.copyOf(ans, k);
    }
}
