package FunctionsAndMethods;

public class callbyvalue {
    public static void swap(int a, int b){
        // swap
        int t = a;
        a = b;
        b = t;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        // swap
        int t = a;
        a = b;
        b = t;

        System.out.println(a);
        System.out.println(b);


        swap(10,15); // not swap value actually -> bcz copy is passed in functions
        System.out.println(a);
        System.out.println(b);
    }
}
