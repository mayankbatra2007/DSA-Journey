package TwoDArrays;

public class linearsearch {
    public static void main(String[] args) {
        
    }
    public static boolean search(int[][] matrix, int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
}
