
//import java.util.Scanner;

public class boardMaker extends Constants{
    public static void main(String[] args){
        difficultyFinal = DifficultyManager.getDifficulty(difficultyInput, difficultyFinal).toLowerCase();
        difficultyFinal = difficultyFinal.substring(0, 1).toUpperCase() + difficultyFinal.substring(1, difficultyFinal.length());

        numbersGiven = DifficultyManager.getNumbersGiven(numbersGiven);
    }

    
}
