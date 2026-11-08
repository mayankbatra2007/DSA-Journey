package Arrays;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        int marks[] = new int[3];

        Scanner sc = new Scanner(System.in);

        // int phy = sc.nextInt();
        // int chem = sc.nextInt();
        // int math = sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        marks[2] = 99;
        // update
        System.out.println(marks[2]);

        // length
        System.out.println(marks.length);

        sc.close();
    }
}
