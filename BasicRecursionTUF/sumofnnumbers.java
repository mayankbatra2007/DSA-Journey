package BasicRecursionTUF;

public class sumofnnumbers {
    public static void main(String[] args) {
        
    }
    public int NnumbersSum(int n) {
        //your code goes here
        if(n == 0)  return 0;
        return n + NnumbersSum(n-1);
    }
}
