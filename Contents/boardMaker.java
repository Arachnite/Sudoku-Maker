
//import java.util.Scanner;
//import java.util.Arrays;

public class boardMaker extends Constants{
    public static void main(String[] args){

        StartScreen.printStartScreen();
        while (startString.equals("0")){
            startString = StartScreen.checkStart();
        }

        if (startString.equals("START")){
            difficultyFinal = DifficultyManager.getDifficulty(difficultyInput, difficultyFinal).toLowerCase();
            difficultyFinal = difficultyFinal.substring(0, 1).toUpperCase() + difficultyFinal.substring(1, difficultyFinal.length());

            numbersGiven = getNumbersGiven(difficultyFinal);
            printBoard(theBoard);
        }
    }

    //Gets the amount of numbers that will be given
    public static int getNumbersGiven(String difficultyFinal) { 
        switch(difficultyFinal) {
            case "Easy":
                numbersGiven = (int)(Math.random() * (35 - 31) + 31);
                return numbersGiven;
            case "Medium":
                numbersGiven = (int)(Math.random() * (30 - 26) + 26);
                return numbersGiven;
            case "Hard":
                numbersGiven = (int)(Math.random() * (25 - 20) + 20);
                return numbersGiven;
            default:
                return numbersGiven;
        }
    }

    public static void printBoard(int[][] theBoard){
        for (int i = 0; i < theBoard.length; i++) {
            for (int o = 0; o < theBoard[i].length; o++) {
                System.out.print(theBoard[i][o] + " ");
                if (o == 2 || o == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if(i == 2 || i == 5) {
                System.out.println("- - - + - - - + - - -");
            }
        }
    }
}
