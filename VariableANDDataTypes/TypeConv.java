package VariableANDDataTypes;
// Implicit type conv
public class TypeConv {
    public static void main(String[] args) {
        int a = 25;
        long b = a;

        System.out.println(b); // 25

        long c = 35;
        // int d = c; type mistmatch error 
        // long size > int  size
        System.out.println(c);
    }
}
