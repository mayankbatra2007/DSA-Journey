package Backtracking;

public class findsubsets {
    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }
    public static void findSubsets(String s, String ans, int i){
        // base case
        if(i == s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // yes choice
        findSubsets(s, ans+s.charAt(i), i+1);
        // no choice
        findSubsets(s, ans, i+1);
    }
}
// tc -> O(N * 2 ^ N)
// sc -> O(N)
// total subsets -> 2 ^ N
// one subset -> time -> N time