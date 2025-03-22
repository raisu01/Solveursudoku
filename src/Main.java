
import java.io.IOException;
import sudoku.SudokuValidator;
import sudoku.SudokuSolver;
import sudoku.SudokuIO;
import sudoku.SudokuGrid;

public class Main {
    public static final int SIZE = 9;
    public static void main(String[] args) {

        int [][] grid = new int[SIZE][SIZE];

        // Vérification de la présence du fichier en argument
        if (args.length == 0) {
        
                SudokuIO.readFromConsole(grid);
           
        }else {
            String filename = args[0];

            // Vérification de l'existence et de la validité de la grille
            if (!SudokuValidator.grilleTrouverEtValide(filename)) {
                System.out.println("Fichier invalide ou format incorrect.");
                return;
            }
              // Lecture de la grille Sudoku depuis le fichier
            try {
                grid = SudokuIO.readInputFile(filename, grid);
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture du fichier: " + e.getMessage());
                return;
            }
        }

        //resolution
        System.out.println("Grille de Sudoku initiale:");
        SudokuGrid.sudokuprint(grid);

        // Résolution du Sudoku
        if (SudokuSolver.solveSudoku(grid)) {
            System.out.println("Sudoku résolu:");
            SudokuGrid.sudokuprint(grid);
        } else {
            System.out.println("Impossible de résoudre ce Sudoku.");
        }
    }
}
