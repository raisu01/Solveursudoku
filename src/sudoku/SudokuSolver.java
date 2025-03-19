package sudoku;

public class SudokuSolver {
    
    // Méthode principale pour résoudre le Sudoku
    public static boolean solveSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) { // Trouver une case vide
                    for (int num = 1; num <= 9; num++) { // Tester 1 à 9
                        if (isValidPlacement(grid, i, j, num)) {
                            grid[i][j] = num; // Placer le nombre
                            if (solveSudoku(grid)) { 
                                return true;
                            }
                            grid[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidPlacement(int[][] grid, int ligne, int col, int num) {
        return lineverif(grid, ligne, num) && colverif(grid, col, num) && blocverif(grid, ligne, col, num);
    }

    private static boolean lineverif(int[][] grid,int ligne, int testvalue ) {
            for (int i = 0; i < 9; i++) {
                if (grid[ligne][i] == testvalue ) {
                    return false; 
                }
            }
        return true;
    } 
    private static boolean colverif(int[][] grid,int col , int testvalue ) {
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == testvalue ) {
                return false; 
            }
        }
    return true;
    } 
    private static boolean blocverif(int[][] grid, int ligne, int col, int testvalue) {
        int startRow = ligne - ligne % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[startRow + i][startCol + j] == testvalue) {
                    return false;
                }
            }
        }
        return true;
    }
}
