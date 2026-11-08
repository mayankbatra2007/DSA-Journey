package BasicMathsTUF;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    public static int countD(int n){
        int c = 0;
        while(n != 0){
            c++;
            n /= 10;
        }
        return c;
    }
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int t = n;
        int len = countD(n);
        while(t  != 0){
            int d = t % 10;
            int power = (int)Math.pow(d, len);
            sum += power;
            t /= 10;
        }
        if(sum == n) return true;
        return false;
    }
}

