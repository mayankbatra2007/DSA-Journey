package VariableANDDataTypes.PS;

import java.util.Scanner;
// : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float erase = sc.nextFloat();

        float bill = pencil + pen + erase;

        float newBill = bill * 0.18f;

        System.out.println(newBill);

        sc.close();
    }
}
