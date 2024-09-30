
//import java.util.Scanner;
//import java.util.Arrays;

public class boardMaker extends Constants {
    public static void main(String[] args) {

        StartScreen.printStartScreen();
        while (startString.equals("0")){
            startString = StartScreen.checkStart();
            if (startString != "0") {
                break;
            }
        }

        if (startString.equals("START")) {
            difficultyFinal = DifficultyManager.getDifficulty(difficultyInput, difficultyFinal).toLowerCase();
            difficultyFinal = difficultyFinal.substring(0, 1).toUpperCase() + difficultyFinal.substring(1, difficultyFinal.length());

            numbersGiven = getNumbersGiven(difficultyFinal);
            printBoard();
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

    public static void printBoard() {
        printf("\n   1 2 3   4 5 6   7 8 9\n");
        for (int i = 0; i < theBoard.length; i++) {
            fflush(i + 1+ "  ");
            for (int o = 0; o < theBoard[i].length; o++) {
                fflush(theBoard[i][o] + " ");
                if (o == 2 || o == 5) {
                    fflush("| ");
                }
            }
            printf("");
            if(i == 2 || i == 5) {
                printf("   - - - + - - - + - - -");
            }
        }
    }
}
