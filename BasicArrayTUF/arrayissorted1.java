package BasicArrayTUF;

public class arrayissorted1 {
    public static void main(String[] args) {
        
    }
    boolean arraySortedOrNot(int[] arr, int n) {
       for(int i = 0; i < n-1; i++){
        if(arr[i] > arr[i+1]) return false;
       }
       return true;
    }
}
