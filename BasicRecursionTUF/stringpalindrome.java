package BasicRecursionTUF;

public class stringpalindrome {
    public static void main(String[] args) {
        
    }
    public boolean palindromeCheck(String s) {
        //your code goes here
        int st = 0;
        int e = s.length()-1;
        char[] arr = s.toCharArray();
        reverse(arr, st, e);
        String r = new String(arr);
        if(r.equals(s)) return true;
        return false;
    }
    public void reverse(char[] s, int st, int e){
        if(st >= e) return;
        char ch = s[st];
        s[st] = s[e];
        s[e] = ch;
        reverse(s, st+1, e-1);
    }
}
