package StringsTUF;

public class longestpalindromicsubstring {
    public static void main(String[] args) {
        
    }
    public String longestPalindrome(String s) {
        // Your code goes here
        int start = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            // odd length
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--; 
                right++;
            }
            if(right - left - 1 > maxLen){
                maxLen = right - left - 1;
                start = left + 1;
            }
            // even length
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--; 
                right++;
            }
            if(right - left - 1 > maxLen){
                maxLen = right - left - 1;
                start = left + 1;
            }
        }
        return s.substring(start , start + maxLen);
    }
}
