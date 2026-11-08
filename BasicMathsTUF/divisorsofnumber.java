package BasicMathsTUF;

public class divisorsofnumber {
    public static void main(String[] args) {
        int[] res = divisors(12);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] divisors(int n) {
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) c++;
        }
        int arr[] = new int[c];
        int k = 0;
        for(int j = 1; j <= n; j++){
            if(n % j == 0){
                arr[k++] = j;
            }
        }
        return arr;
    }
}
