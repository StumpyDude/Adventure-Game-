import java.util.Scanner;

public class AdventureMove  {
    public static int[] Move(int[][] grid, int posR, int posC, int cols, int rows) {
    

    // Movement Input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "UP" -> {
                if (posR > 0) posR--;
            }
            case "DOWN" -> {
                if (posR < rows - 1) posR++;
            }
            case "LEFT" -> {
                if (posC > 0) posC--;
            }
            case "RIGHT" -> {
                if (posC < cols - 1) posC++;
            }
            default -> System.out.println("Invalid command");
        }

        int pos = grid[posR][posC]; // to show the position and options
        AdventureOptions.Options(pos);

        return new int[]{posR,posC}; // tracking where the player is

    }
}
