package VariableANDDataTypes;
import java.util.Scanner;
// Product
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a * b;
        System.out.println(p);
        sc.close();
    }
}
