package RecursionTUF.FAQsMedium;

public class minsumtarget {
    public static void main(String[] args) {
        
    }
    static int ans = Integer.MAX_VALUE;
    public static int minimizeTheDiff(int[][] mat, int target){
        ans = Integer.MAX_VALUE;
        solve(mat, target, 0, 0);
        return ans;
    }
    public static void solve(int[][] mat, int target, int row, int sum){
        // bc
        if(row == mat.length){
            ans = Math.min(ans, Math.abs(target-sum));
            return;
        }
        // try every ele in current row
        for(int j = 0; j < mat[row].length; j++){
            // choose one ele and move to next row
            solve(mat, target, row+1, sum + mat[row][j]);
        }
    }
}
// tc -> O(n ^ m);
// sc -> O(m)
// n -> col, m -> rows
