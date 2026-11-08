package FunctionsAndMethods;

public class primeinrange {
    public static void main(String[] args) {
        primeinRange(10);
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n == 0 || n == 1){
            System.out.println("invalid");
            return false;
        }
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeinRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){ // true
                System.out.println(i);
            }
        }
    }
}
