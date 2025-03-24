package sudoku;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SudokuIO {
    public static final int SIZE = 9;

    public static int[][] readInputFile(String file, int[][] grid) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int row = 0;
        while ((line = reader.readLine()) != null && row < SIZE) {
            String[] values = line.split(" ");
            for (int column = 0; column < SIZE; column++) {
                grid[row][column] = Integer.parseInt(values[column]);
            }
            row++;
        }
        reader.close();
        return grid;
    }

    public static void readFromConsole(int[][] grid) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez suivre les instructions pour remplir le tableau.");
            System.out.println("Vous allez maintenant saisir 9 lignes de 9 valeurs chacune, séparées par des espaces.");
    
            for (int row = 0; row < SIZE; row++) {
                System.out.println("Veuillez saisir les 9 valeurs de la ligne " + (row + 1) + " (séparées par des espaces) :");
                String line = sc.nextLine();
                String[] values = line.split(" ");
                for (int column = 0; column < SIZE; column++) {
                    grid[row][column] = Integer.parseInt(values[column]);
                }
            }
            sc.close();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Veuillez verifier le nombre de valeur");
            return;
        }
        
    }
}
