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

        if (!file.exists() || !file.isFile()) {
            System.out.println("Fichier invalide ou introuvable");
            return false;
        }

        try (Scanner sc = new Scanner(file)) {
            for (int i = 0; i < 9; i++) {
                // on decoupe la ligne en prenant en compte les espace
                String[] row = sc.nextLine().trim().split("\\s+");
                // si la longueur est different de 9 on retourne false
                if (row.length != 9) {
                    System.out.println("Longueur de la ligne invalide " + (i + 1));
                    return false;
                }
                for (String value : row) {
                    if (!value.matches("\\d")) {
                        System.out.println("Valeur invalide");
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