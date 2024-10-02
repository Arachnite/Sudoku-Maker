
import java.util.Scanner;
import java.util.Arrays;

public class DifficultyManager extends Constants{

    //Gets the difficulty of the Sudoku Board
    public static String getDifficulty(String difficultyInput, String difficultyFinal) {
        printf("\nSelect a difficulty (Easy, Medium, Hard):");
        while (true) {
            difficultyInput = difficultyReader(sc);
            difficultyFinal = difficultyFinalConstant(difficultyInput);
            if (difficultyFinal != "0"){
                return difficultyFinal;
            }
        }
    }

    //Reads the difficulty written by the user via terminal and returns difficultyInput
    public static String difficultyReader(Scanner sc) {
        difficultyInput = sc.nextLine().toUpperCase();
        return difficultyInput;
    }

    //Checks if the given input is a valid difficulty type
        //Repeats the process if not
        //Returns the difficultyInput if so
    public static String difficultyFinalConstant(String difficultyInput) {
        while (true) {
            if (Arrays.asList(difficultyTypes).contains(difficultyInput)) {
                return difficultyInput;
            } else {
                printf("\nPlease select a valid difficulty:");
                printf("Easy, Medium, Hard");
                return "0";
            }
        }
    }
}
