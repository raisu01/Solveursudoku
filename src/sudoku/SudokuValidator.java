package sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuValidator{
    public static boolean fichierPresentEnArgument(int[] args){
        if(args == null || args.length == 0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean grilleTrouverEtValide(String filename){
        File file = new File(filename);

        try (Scanner sc = new Scanner(file)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (!sc.hasNextInt()) {
                        return false;
                    }
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable");
            return false;
        }
    }
}