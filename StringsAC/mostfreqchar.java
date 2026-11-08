package StringsAC;

public class mostfreqchar {
    public static void main(String[] args) {
        System.out.println(getMaxChar("testsample"));
    }
    public static char getMaxChar(String s){
        int[] freq = new int[26];
        // traverse over string and update freq accd
        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            freq[currChar-'a']++;
        }
        int maxFreq = -1;
        char ans = 'a';
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+'a');
            }
        }
        return ans;
    }
}
