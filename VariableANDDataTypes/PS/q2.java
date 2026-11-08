package VariableANDDataTypes.PS;

import java.util.Scanner;

// area of sq
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int area = s * s;
        System.out.println(area);

        sc.close();
    }
}
