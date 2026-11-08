package StringsAC;

public class validpalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
    }
    public static boolean validPalindromeOptimal(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    } // tc -> O(N) sc -> O(N)
    public static boolean validPalindrome(String s){
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return rev.equals(s);
    }
}
