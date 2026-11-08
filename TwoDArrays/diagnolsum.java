package TwoDArrays;

public class diagnolsum {
    public static void main(String[] args) {
        // Primary Diag -> i == j
        // Secondary Diag -> i + j == n
    }
    public static int primaryDiagSumm(int[][] mat){
        int s = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(i == j){
                    s += mat[i][j];
                }
            }
        }
        return s;
    }
    // optimal
    public static int primaryDiagSumOptimal(int[][] mat){
        int s = 0;
        for(int i = 0; i < mat.length; i++){
            s += mat[i][i];
        }
        return s;
    }
    public static int secondaryDiagSum(int[][] mat){
        int s = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(i + j == mat.length-1){
                    s += mat[i][j];
                }
            }
        }
        return s;
    }
    // optimal
    public static int secondaryDiagSumOptimal(int[][] mat){
        int s = 0;
        for(int i = 0; i < mat.length; i++){
            s += mat[i][mat.length-i-1];
        }
        return s;
    }
}
