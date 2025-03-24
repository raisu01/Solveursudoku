package sudoku;

public class SudokuGrid {
    
    public static void sudokuprint(int[][] grille) {
        String ligneSéparatrice = "├───┼───┼───┼───┼───┼───┼───┼───┼───┤";
        String ligneHaut = "┌───┬───┬───┬───┬───┬───┬───┬───┬───┐";
        String ligneBas = "└───┴───┴───┴───┴───┴───┴───┴───┴───┘";

        System.out.println(ligneHaut);
        for (int ligne = 0; ligne < 9; ligne++) {
            System.out.print("│");
            for (int colonne = 0; colonne < 9; colonne++) {
                System.out.print(" " + grille[ligne][colonne] + " │");
            }
            System.out.println();

            // Ajout d'une ligne séparatrice après chaque ligne sauf la dernière
            if (ligne != 8) {
                System.out.println(ligneSéparatrice);
            }
        }
        System.out.println(ligneBas);
    }
}
