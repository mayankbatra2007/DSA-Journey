package BasicMathsTUF;

public class isprime {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
    public static boolean isPrime(int n) {
          //your code goes here
          if(n < 2) return false;
          for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
          }
          return true;
    }
}
