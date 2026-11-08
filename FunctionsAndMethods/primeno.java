package FunctionsAndMethods;

public class primeno {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
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
    public static boolean isPrimeOptimal(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    } // sqrt(n) -> bcz factors repeat
}