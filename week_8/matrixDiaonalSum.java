package week_8;

public class matrixDiaonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        for (int i = 0, j = mat.length - 1; j >= 0; i++, j--) {
            if (i == j)
                continue;
            sum += mat[i][j];
        }
        return sum;
    }
}
