package VariableANDDataTypes;
import java.util.*; // package -> collection of classes
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // class object
        String s = sc.next();

        System.out.println(s);

        sc.close();

        int number = sc.nextInt();

        System.out.println(number);
    }
}
