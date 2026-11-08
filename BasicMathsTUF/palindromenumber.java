package BasicMathsTUF;

public class palindromenumber {
    public static void main(String[] args) {
        boolean isp = isPalindrome(121);
        System.out.println(isp);
    }
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int t = n;
        while(t != 0){
            int d = t % 10;
            rev = rev * 10 + d;
            t /= 10;
        }
        if(rev == n) return true;
        return false;
    }
}
