package PatternsAdv;

public class solidrhombus {
    public static void main(String[] args) {
        solidRhombus(5);
    }
    public static void solidRhombus(int n){
        for(int i = 1; i <= n; i++){
            // spaces
            for(int j = 1; j <= n-i; j++){
                System.err.print(" ");
            }
            //stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
