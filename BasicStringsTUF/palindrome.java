package BasicStringsTUF;

public class palindrome {
    public static void main(String[] args) {
        
    }
    public boolean palindromeCheck(String s) {
        //your code goes here
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
