
import java.util.Scanner;

public class DifficultyManager extends Constants{

    //I don't know why tf I need this
    public static void main(String[] args){

    }

    //Gets the difficulty of the Sudoku Board
    public static String getDifficulty(String difficultyInput, String difficultyFinal){
        System.out.println("Select a difficulty (Easy, Medium, Hard):");
        while(difficultyFinal.equals("0")){
            difficultyInput = difficultyReader(Constants.sc);
            difficultyFinal = difficultyFinalConstant(difficultyInput);
            if(difficultyFinal != "0"){
                return difficultyFinal;
            }
        }
        return null;
    }

    //Reads the difficulty written by the user via terminal and returns difficultyInput
    public static String difficultyReader(Scanner sc){
        difficultyInput = sc.nextLine().toUpperCase();
        return difficultyInput;
    }

    //Checks if the given input is a valid difficulty type
        //Repeats the process if not
        //Returns the difficultyInput if so
    public static String difficultyFinalConstant(String difficultyInput){
        while(difficultyInput != "EASY" && difficultyInput != "MEDIUM" && difficultyInput != "HARD"){
            if (difficultyInput.equals("EASY")){
                return difficultyInput;
            } else if (difficultyInput.equals("MEDIUM")){
                return difficultyInput;
            } else if (difficultyInput.equals("HARD")){
                return difficultyInput;
            } else {
                System.out.println("Please select a valid difficulty:");
                return "0";
            }
        }
        return null;
    }

    //Gets the numbers given
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
