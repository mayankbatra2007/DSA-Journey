package BasicMathsTUF;

public class perfectnumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }
    public static boolean isPerfect(int n) {
        int divisors = 0;
        int t = n;

        for(int i = 1; i < n; i++){
            if(n % i == 0){
                divisors += i;
            }
        }

        if(divisors == t) return true;
        return false;
    }
}
