package FunctionsAndMethods;

public class binarytodecimal {
    public static void main(String[] args) {
        binTodec(1010);
    }
    public static void binTodec(int binNum){
        int power = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,power));
            power++;
            binNum = binNum / 10;
        }

        System.out.println(decNum);
    }
}
