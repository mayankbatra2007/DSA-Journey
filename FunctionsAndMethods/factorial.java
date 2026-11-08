package FunctionsAndMethods;

public class factorial {
    public static void main(String[] args) {
        int n = 5;

        long f = 1;

        for(int i = 1; i <= n; i++){
            f *= i;
        }

        System.out.println(f);

        long fac = fact(5);

        System.out.println(fac);
    }
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
