package BasicStringsTUF;

public class anagram {
    public static void main(String[] args) {
        
    }
    public boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int c : freq){
            if(c != 0) return false;
        }
        return true;
    }
}
// tc -> O(N)
