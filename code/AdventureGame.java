import java.util.Scanner;


public class AdventureGame {

    public static void main(String[] args){

        

        Scanner scanner = new Scanner(System.in);

        int posR = 0;
        int posC = 0;

        int[][] grid;

        String check = "check";
        do{
            System.out.println("Type GO to start the game ");
            System.out.print(">> ");
            
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("GO")){
                grid = AdventureGrid.createGrid();

                do {
                int[] newPos = AdventureMove.Move(grid, posR , posC, 18, 28);
                posR = newPos[0];
                posC = newPos[1];
                }while(input.equals("GO"));

            }else{
                System.out.println("Type GO to start the game");
            }  
        }while(check.equals("check"));
    }
}