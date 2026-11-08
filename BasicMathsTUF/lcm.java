package BasicMathsTUF;

public class lcm {
    public static void main(String[] args) {
        System.out.println(Lcm(4,16));
    }
    public static int Lcm(int n1, int n2){
        int a = n1;
        int b = n2;

        // Find GCD
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }

        int gcd = a;

        return (n1 * n2) / gcd;
    }
}
