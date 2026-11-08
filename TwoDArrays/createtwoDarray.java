package TwoDArrays;

import java.util.Scanner;

public class createtwoDarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // 3 x 3 -> 9 cells
        // System.out.println(matrix);
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++){ // rows
            for(int j = 0; j < m; j++){ // cols
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
