package TwoDArrays;
import java.util.*;
public class sumofeachcol {
    public static void main(String[] args) {
        
    }
    public static List<Integer>  sumOfEachCol(int[][] mat){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < mat[0].length; i++){
            int s = 0;
            for(int j = 0; j < mat.length; j++){
                s += mat[j][i];
            }
            ans.add(s);
        }
        return ans;
    }
}
