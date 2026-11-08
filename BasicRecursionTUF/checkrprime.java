package BasicRecursionTUF;

public class checkrprime {
    public static void main(String[] args) {
        
    }
    public boolean checkPrime(int num) {
        //your code goes here
        if (num < 2) return false;
        int i = 2;
        boolean isDiv =  Divsible(num, i);
        return isDiv;
    }
    public boolean Divsible(int num, int i){
        if(i == num) return true;
        if(num % i == 0) return false;
        return Divsible(num, i+1);
    }
}
