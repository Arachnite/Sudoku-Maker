

public class BoardMaker extends Constants {

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
        printf("\n   1 2 3   4 5 6   7 8 9\n\n");
        for (int i = 0; i <= theBoard.length - 1; i++) {
            printf(i + 1 + "  ");
            for (int o = 0; o < theBoard[i].length; o++) {
                printf(theBoard[i][o] + " ");
                if (o == 2 || o == 5) {
                    printf("| ");
                }
            }
            printf("\n");
            if(i == 2 || i == 5) {
                printf("   - - - + - - - + - - -\n");
            }
        }
        printf("\n");
    }
}
