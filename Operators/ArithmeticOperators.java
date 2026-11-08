package Operators;
public class ArithmeticOperators {
    public static void main(String[] args) {
        // arithmetic OP
        // Binary +,-,*,/,%
        int a = 5;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Unary ++,--
        a++; // a = a + 1
        b--; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        // pre inc -> inc/dec first and then use
        --a;
        // post inc -> use first and then inc/dec
        b++;
    }
}
