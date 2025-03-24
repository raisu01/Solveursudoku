package sudoku;

public class SudokuGrid {
    
    public static void sudokuprint(int[][] grille) {
        String ligneHaut = "╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗";
        String ligneMilieu = "╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣";
        String ligneBloc =  "╟───┼───┼───╫───┼───┼───╫───┼───┼───╢";
        String ligneBas =   "╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝";

        System.out.println(ligneHaut);
        for (int ligne = 0; ligne < 9; ligne++) {
            System.out.print("║");
            for (int colonne = 0; colonne < 9; colonne++) {
                System.out.print(" " + (grille[ligne][colonne] == 0 ? " " : grille[ligne][colonne]) + " "); // Remplace 0 par espace
                if ((colonne + 1) % 3 == 0) {
                    System.out.print("║"); // Bordure plus épaisse entre blocs 3x3
                } else {
                    System.out.print("│"); // Bordure classique entre colonnes
                }
            }
            System.out.println();

            // Ajout des lignes séparatrices
            if (ligne == 8) {
                System.out.println(ligneBas); // Dernière ligne
            } else if ((ligne + 1) % 3 == 0) {
                System.out.println(ligneMilieu); // Séparation entre blocs 3x3
            } else {
                System.out.println(ligneBloc); // Séparation normale
            }
        }
    }
}
