public class NQueens {
    public static boolean isSafe(char[][] matrix, int row, int colm) {
        // vertically up case
        for (int i = row - 1; i >= 0; i--) {
            if (matrix[i][colm] == 'Q') {
                return false;
            }
        }

        // primary diagonal up
        for (int i = row - 1, j = colm - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }

        // secondry diagonal up
        for (int i = row - 1, j = colm + 1; i >= 0 && j < matrix.length; i--, j++) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printMatrix(char[][] matrix) {
        System.out.println("----------- Chess board ------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueen(char[][] matrix, int row) {
        // base case
        if (row == matrix.length) {
            printMatrix(matrix);
            return;
        }

        // recursive steps
        for (int j = 0; j < matrix.length; j++) {
            if (isSafe(matrix, row, j)) {
                matrix[row][j] = 'Q';
                nQueen(matrix, row + 1);
                matrix[row][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] matrix = new char[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 'X';
            }
        }
        nQueen(matrix, 0);
    }
}
