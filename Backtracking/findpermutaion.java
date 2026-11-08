package Backtracking;

public class findpermutaion {
    public static void main(String[] args) {
        
    }
    public static void findPermutation(String s, String ans){
        // base case
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        // rec
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            // "abcde" = "ab" + "de" = "abde"
            String News = s.substring(0, i) + s.substring(i+1);
            findPermutation(News, ans+curr);
        }
    }
}
// N! -> Permutation
// tc -> O(n * n!)