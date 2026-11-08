package Recursion;
// Print all binary strings of length n that do not contain consecutive 1s.
public class binarystrings {
    public static void main(String[] args) {
         
    }
    public static void printBinaryString(int n, int lastPlace, String binaryS){
        if(n == 0){
            System.out.println(binaryS); 
            return;
        }
        // add 0
        printBinaryString(n-1, 0, binaryS+"0");
        // add 1 only if prev char was 0
        if(lastPlace == 0){
            printBinaryString(n-1, 1, binaryS+"1");
        }
    }
}
