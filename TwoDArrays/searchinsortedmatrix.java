package TwoDArrays;

public class searchinsortedmatrix {
    public static void main(String[] args) {
        
    }
    public static boolean searchInSortedMatBetter(int[][] mat, int target){
        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0; i < row; i++){
            int low = 0;
            int high = col-1;

            while(low <= high){
                int mid = low + (high-low)/2;
                if(mat[i][mid] == target){
                    return true;
                }
                else if(mat[i][mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static boolean stairCaseSearch(int[][] mat, int key){
        int row = 0, col = mat[0].length-1;

        while(row < mat.length && col >= 0){
            if(mat[row][col] == key){
                System.out.println("Found at : ("+ row+ ","+ col+")");
                return true;
            }
            else if(key < mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
