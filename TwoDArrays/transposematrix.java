package TwoDArrays;

public class transposematrix {
    public static void main(String[] args) {
        
    }
    public static int[][] Transpose(int[][] mat){
        if(mat == null || mat.length == 0){
            return new int[0][0];
        }
        // for orignal array
        int rows = mat.length;
        int cols = mat[0].length;
        // for new array
        int newRows = cols;
        int newCols = rows;
        int ans[][] = new int[newRows][newCols];

        // logic
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                ans[i][j] = mat[j][i];
            }
        }
        return ans;
    }
}
