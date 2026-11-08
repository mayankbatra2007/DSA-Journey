package PatternsAdv;

public class floydstriangle {
    public static void main(String[] args) {
        floydsTriangle(5);
    }
    public static void floydsTriangle(int n){
        int c = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(c+ " ");
                c++;
            }
            System.out.println();
        }
    }
}
