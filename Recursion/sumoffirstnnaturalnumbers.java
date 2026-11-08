package Recursion;

public class sumoffirstnnaturalnumbers {
    public static void main(String[] args) {
        
    }
    public static int sumOfFirstNNaturalNumbersIterations(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            s += i;
        }
        return s;
    }
    public static int sumOfFirstNNaturalNumbersRec(int n){
        if(n == 1){ // Base case
            return n;
        }
        return n + sumOfFirstNNaturalNumbersRec(n-1);
        // Processing + RecCall
    }
}
