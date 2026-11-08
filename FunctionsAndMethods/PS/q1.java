package FunctionsAndMethods.PS;
// Write a Java method to compute the average of three numbers
public class q1 {
    public static void main(String[] args) {
        System.out.println(avg(3,4,5));
    }
    public static double avg(int a, int b, int c){
        double avg = (a + b + c) / (double)3;
        return avg;
    }
}
