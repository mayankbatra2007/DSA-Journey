package Recursion;
// Print numbers from n to 1
public class printnumbersfromntoone {
    public static void main(String[] args) {
        
    }
    public static void printNToOneIterations(int n){
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void printNToOneRec(int n){
        if(n == 1){ // Base case
            System.out.println(n);
            return;
        }
        System.out.println(n); // Processing
        printNToOneRec(n-1); // Recursive call
    }
}
