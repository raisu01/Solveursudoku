package sudoku;

public class SudokuGrid{
   
    public static void sudokuprint(int[][] grille) {
        String ligneSéparatrice = "├───────┼───────┼───────┤";

        System.out.println("┌───────┬───────┬───────┐");
        for (int ligne = 0; ligne < 9; ligne++) {
            System.out.print("│ ");
            for (int colonne = 0; colonne < 9; colonne++) {
                System.out.print(grille[ligne][colonne] + " ");  // Afficher les chiffres résolus
                // Ajout de séparateurs verticaux pour diviser les blocs 3x3
                if ((colonne + 1) % 3 == 0 && colonne != 9) {
                    System.out.print("│ ");
                }
            }
            System.out.println();

            // Ajout de séparateurs horizontaux entre les blocs 3x3
            if ((ligne + 1) % 3 == 0 && ligne != 8) {
                System.out.println(ligneSéparatrice);
            }
        }
        System.out.println("└───────┴───────┴───────┘");
    }
}