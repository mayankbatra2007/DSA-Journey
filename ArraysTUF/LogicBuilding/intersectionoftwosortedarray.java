package ArraysTUF.LogicBuilding;
import java.util.*;
public class intersectionoftwosortedarray {
    public static void main(String[] args) {
        
    }
    public static int[] intersectionArrayBrute(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans[] = new int[Math.min(n1, n2)];
        int visited[] = new int[n2];
        int k = 0;

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1[i] == nums2[j] && visited[j] == 0){
                    ans[k] = nums1[i];
                    k++;
                    visited[j] = 1;
                    break;
                }
            }
        }
        return Arrays.copyOf(ans, k);
    }
    public static int[] intersectionArrayTwoPointer(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans[] = new int[Math.min(n1, n2)];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
        }
        return Arrays.copyOf(ans, k);
    }
}
