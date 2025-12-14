


public class AdventureGrid {

    // Grid Dimensions
    static int rows = 25;
    static int cols = 25;

    static int[][] grid = new int[25][25];

    public static int[][] createGrid() {
        
        System.out.println("---------------");
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
        System.out.println("Grid Created");
        System.out.println("Game Started starting at 1");
        System.out.println("Input >> left, right, up, down");

        return grid;
    }
}
