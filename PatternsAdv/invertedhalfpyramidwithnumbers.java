package PatternsAdv;

public class invertedhalfpyramidwithnumbers {
    public static void main(String[] args) {
        invertedHalfPyramidWithNumbers(4);
    }
    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
