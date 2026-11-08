package VariableANDDataTypes.PS;

import java.util.Scanner;
// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =  sc.nextInt();

        double avg = (a+b+c) / 3;

        System.out.println(avg);

        sc.close();
    }
}
