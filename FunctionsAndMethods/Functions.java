package FunctionsAndMethods;

public class Functions {
    public static void printHello(){
        System.out.println("hello world");
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int multiply(int a, int b){ // parameters or formal params
        return a * b;
    }
    public static void main(String[] args) {
        printHello();
        sum(4,5);
        System.out.println(multiply(1, 2)); // arguments
    }
}
/*
returnType name (){
    return statement
} 
*/
/*
returnType name(type param1, type param2){
    return statement
} 
*/