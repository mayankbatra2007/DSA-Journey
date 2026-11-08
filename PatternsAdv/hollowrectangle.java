package PatternsAdv;

public class hollowrectangle {
    public static void main(String[] args) {
        hollowRectangle(5,4);
    }
    public static void hollowRectangle(int totRows, int totCols){
        for(int i = 1; i <= totRows; i++){
            for(int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
}
