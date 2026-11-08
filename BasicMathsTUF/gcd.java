package BasicMathsTUF;

public class gcd {
    public static void main(String[] args) {
        int g = Gcd(18,12);
        System.out.println(g);
    }
    public static int Gcd(int n1, int n2){
        while(n2 != 0){
            int t = n2;
            n2 = n1 % n2;
            n1 = t;
        }
        return n1;
    }
}
