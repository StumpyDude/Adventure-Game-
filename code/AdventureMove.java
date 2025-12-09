import java.util.Scanner;

public class AdventureMove  {
    public static void Move(int[][] grid, int pos, int posR, int posC, int cols, int rows) {
    

    // Movement Input Test
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "UP":
                if (posR > 0) posR--;
                break;
            case "DOWN":
                if (posR < rows - 1) posR++;
                break;
            case "LEFT":
                if (posC > 0) posC--;
                break;
            case "RIGHT":
                if (posC < cols - 1) posC++;
                break;
            default:
                System.out.println("Invalid command");
        }

        pos = grid[posR][posC];
        System.out.println(pos);

    }
}
