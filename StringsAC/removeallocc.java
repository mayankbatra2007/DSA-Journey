package StringsAC;

public class removeallocc {
    public static void main(String[] args) {
        System.out.println(removeOccurences("abcbabbbaabc", "abc"));
    }
    public static String removeOccurences(String s, String part){
        int idx;
        while((idx = s.indexOf(part)) != -1){
            s = s.substring(0, idx) + s.substring(idx+part.length());
        }
        return s;
    } // tc -> O(N2)
}
