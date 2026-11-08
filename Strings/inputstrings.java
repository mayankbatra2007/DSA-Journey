package Strings;

import java.util.Scanner;

public class inputstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // single world
        String fullName = sc.nextLine(); // full line
        System.out.println(name);
        System.out.println(fullName);
        sc.close();
    }
}
