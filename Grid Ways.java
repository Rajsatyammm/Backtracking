public class GridWays {
    public static int totalWays(int grid[][], int row, int colm) {
        //base case
        if((row == grid.length-1) && (colm == grid[0].length-1)) {
            return 1;
        }
        else if((row == grid.length) || (colm == grid[0].length)) {
            return 0;
        }

        //recursive case
        int valRight = totalWays(grid, row, colm+1);

        int valDown = totalWays(grid, row+1, colm);
        return (valRight + valDown);
    }
    public static void main(String[] args) {
        int n = 5;
        int grid[][] = new int[n][n];
        int total = totalWays(grid, 0, 0);
        System.out.println(total);
    }
}
