import java.util.Scanner;

// cd onedrive\desktop\Adventure-Game-\code in the terminal to run 

public class AdventureGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        int posR = 0;
        int posC = 0;


        int[][] grid = AdventureGrid.createGrid();
        do {
            int[] newPos = AdventureMove.Move(grid, posR , posC, 5, 5);
            posR = newPos[0];
            posC = newPos[1];
        }while(input.equals("GO"));
    }
}
