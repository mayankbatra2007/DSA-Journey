package StringsAC;

public class replacealloccinstring {
    public static void main(String[] args) {
        
    }
    public static String replaceSubstring(String str, String sub){
        return str.replace(sub, " ").trim();
    } //tc -> O(N) sc -> O(N)
}
