package TwoDArrays;

public class rotatematrixbyninetydeg {
    public static void main(String[] args) {
        
    }
    public static void Rotateby90Deg(int[][] mat){
        // transpose
        // row rev
        for(int i = 0; i < mat.length; i++){
            for(int j = i+1; j < mat[0].length; j++){
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }
        for(int i = 0; i < mat.length; i++){
            int st = 0;
            int end = mat.length-1;
            while(st <= end){
                int t = mat[i][st];
                mat[i][st] = mat[i][end];
                mat[i][end] = t;
                st++;
                end--;
            }
        }
    }
}
