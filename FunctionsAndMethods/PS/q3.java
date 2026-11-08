package FunctionsAndMethods.PS;
// Write a Java program to check if a number is a palindrome in Java
public class q3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int n){
        int t = n;

        int rev = 0;
        while(t != 0){
            int d = t % 10;
            rev = rev * 10  + d;
            t /= 10;
        }

        if(n ==  rev){
            return true;
        }
        return false;
    }
}
