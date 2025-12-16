import java.util.Scanner;

public class AdventureMove  {
    public static int[] Move(int[][] grid, int posR, int posC, int cols, int rows) {
        int pos = grid[posR][posC];

    // Movement Input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "U" -> {
                if (posR > 0) posR--;
            }
            case "D" -> {
                if (posR < rows - 1) posR++;
            }
            case "L" -> {
                if (posC == 0 && pos != 1){
                    posC = 17;
                    posR--;
                } else if (posC > 0) {
                    posC--;
                }
            }
            case "R" -> {
                if(posC == 17 && pos != 504){
                    posC = 0;
                    posR++;
                } else if (posC < cols - 1) {
                    posC++;
                }
            }
            default -> System.out.println("Invalid command");
        }

        pos = grid[posR][posC];
        System.out.println("Current Position: " + pos + ", Coordinates: (" + posR + "," + posC + ")");
        //AdventureOptions.Options(pos);

        return new int[]{posR,posC}; // returns updated position

    }
}
