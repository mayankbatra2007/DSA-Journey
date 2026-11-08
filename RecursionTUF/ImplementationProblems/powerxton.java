package RecursionTUF.ImplementationProblems;

public class powerxton {
    public static void main(String[] args) {
        
    }
    public double myPow(double x, int n) {
          //your code goes here
          if(n == 0) return 1.0;
          if(n < 0) return (1 / x) * myPow(1 / x, -(n+1));
          return x * myPow(x, n-1);
    }
    public double myPowOptimal(double x, int n) {
        if(n == 0) return 1.0;
        double halfPow = myPow(x, n/2);
        double halfPowSq = halfPow * halfPow;
        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
}
