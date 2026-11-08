package VariableANDDataTypes;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        // area of circle
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println(area);
        sc.close();
    }
}
