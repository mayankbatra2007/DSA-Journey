package FunctionsAndMethods;

public class functionOverloading {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(2,3,4));
        System.out.println(sum(3.0f,4.0f));
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static  float sum(float a, float b){
        return a + b;
    }
}
// diff params type
// diff no of params
// same name