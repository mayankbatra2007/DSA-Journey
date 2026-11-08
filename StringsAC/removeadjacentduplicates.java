package StringsAC;

public class removeadjacentduplicates {
    public static void main(String[] args) {
        System.out.println(removeAdjDuplicates("abbaca"));
    }
    public static String removeAdjDuplicates(String s){
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // compare ans k rightmost char ko curr char se compare
            if(ans.length() > 0 && ans.charAt(ans.length()-1) == ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                // if these two are diff char then append
                ans.append(ch);
            }
        }
        return ans.toString();
    } // tc -> O(N) sc -> O(N)
}
