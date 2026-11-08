package TwoDArrays;
import java.util.*;
public class sumofeachrow {
    public static void main(String[] args) {
        
    }
    public static List<Integer> sumOfEachRow(int[][] mat){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
            int s = 0;
            for(int j = 0; j < mat[0].length; j++){
                s += mat[i][j];
            }
            ans.add(s);
        }
        return ans;
    }
}
