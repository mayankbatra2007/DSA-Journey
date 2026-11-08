package StringsAC;

public class revstring {
    public static void main(String[] args) {
        String s = "abc";
        String r = reverse(s);
        System.out.println(r);
    }
    public static String reverse(String s){
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return rev;
    } // tc -> O(N2)
    public static String reverseOptimal(String s){
        return new StringBuilder(s).reverse().toString();
    } // tc -> o(N)
}
