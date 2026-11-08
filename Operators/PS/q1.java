package Operators.PS;
// hat will be the output of the following programs 
public class q1 {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + ","); // 5 
        System.out.print(exp2);// 4
    }
}
// x * y / x
// = 2 * 5 / 2
// = 10 / 2
// = 5
// x * (y / x)
// = 2 * (5 / 2)
//= 2 * 2
//= 4