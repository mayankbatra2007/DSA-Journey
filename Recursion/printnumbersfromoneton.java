package Recursion;

public class printnumbersfromoneton {
    public static void main(String[] args) {
        
    }
    public static void printOneToNIterations(int n){
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    public static void printOneToNRec(int n){
        if(n == 1){ // Base case
            System.out.println(n);
            return;
        }
        printOneToNRec(n-1); // Rec call
        System.out.println(n); // Processing
    }
}
