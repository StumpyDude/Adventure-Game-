
public class AdventureGame {

    public static void main(String[] args){
        // Grid Dimensions
        int rows = 5, cols = 5, posR = 0, posC = 0;
        int[][] grid = new int[rows][cols];

        int pos = grid[0][0];

        // Filling grid test
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = (r) * cols + c + 1;
            }
        }



        // Print the grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(grid[r][c] + "\t");
            }
            System.out.println();
        }

       AdventureMove.Move(grid, pos, posR, posC, cols, rows);
        
    }
}
