package TwoDArrays;
import java.util.*;
public class waveprintmatrix {
    public static void main(String[] args) {
        
    }
    public static List<Integer> wavePrintMatrix(int[][] mat){
        List<Integer> ans = new ArrayList<>();

        // lets move col wiise
        for(int col = 0; col < mat[0].length; col++){
            // cheeck even or odd col idx
            if(col % 2 != 0){
                // odd -> B to T
                for(int row = mat.length-1; row >= 0; row--){
                    ans.add(mat[row][col]);
                }
            }
            else{
                // even -> T to B
                for(int row = 0; row < mat.length; row++){
                    ans.add(mat[row][col]);
                }
            }
        }
        return ans;
    }
}
