
//import java.util.Scanner;

public class boardMaker extends Constants{
    public static void main(String[] args){
        difficultyFinal = DifficultyManager.getDifficulty(difficultyInput, difficultyFinal).toLowerCase();
        difficultyFinal = difficultyFinal.substring(0, 1).toUpperCase() + difficultyFinal.substring(1, difficultyFinal.length());

        numbersGiven = getNumbersGiven(numbersGiven);
        System.out.println(numbersGiven);
    }

    public static int getNumbersGiven(int numbersGiven){
        if(difficultyFinal.equals("Easy")){
            numbersGiven = (int)(Math.random() * (35 - 31) + 31);
        } else if(difficultyFinal.equals("Medium")){
            numbersGiven = (int)(Math.random() * (30 - 26) + 26);
        } else if(difficultyFinal.equals("Hard")){
            numbersGiven = (int)(Math.random() * (25 - 20) + 20);
        }
        return numbersGiven;
    }
}
