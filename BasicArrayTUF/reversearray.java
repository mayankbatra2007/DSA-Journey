package BasicArrayTUF;

public class reversearray {
    public static void main(String[] args) {
        
    }
    public void reverse(int[] arr, int n) {
        int s = 0;
        int e = n-1;
        while(s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
}
