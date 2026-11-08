package FunctionsAndMethods;

public class binomialcoeff {
    public static void main(String[] args) {
        System.out.println(binCoeff(2,3));
    }
    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int bin_coef = fact_n / (fact_r * fact_nr);

        return bin_coef;
    }
}
// n ^ C r
// n! / r! * (n-r)!
