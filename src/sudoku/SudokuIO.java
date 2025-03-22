package sudoku;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SudokuIO{
    public static final int SIZE = 9;
    
    public static int [] [] readInputFile(String file ,int[][] grid ) throws IOException{
        // on initialise la grille
        // cette ligne permet de lire de fichier passe en parametre
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int row = 0;
        // ici nous allons iterer sur le contenue du fichier
        while((line = reader.readLine()) != null && row < SIZE){
            // 
            String [] values = line.split(" ");
            for (int column = 0; column < SIZE; column++){
                grid[row][column] = Integer.parseInt(values[column]);
            }
            row++;
        }
        reader.close();

        return grid;
    }

    public static void readFromConsole(int[][] grid ){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez suivre les instructions pour pouvoir remplir le tableau");
        System.out.println("Vous allez à presence remplir 81 valeurs");

        for(int row = 0, count = 1; row < SIZE; row++){
            for (int column = 0; column < SIZE; column++){
                System.out.println("veuillez saisir le "+ count +" eme valeur : (il reste "+ (81 - count) +" valeurs");
                grid [row][column] = sc.nextInt();
                count++;
            }
        }
        sc.close();

    }
}