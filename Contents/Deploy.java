



public class Deploy {
    public static void main(String[] args) {

        StartScreen.printStartScreen();
        while (StartScreen.startString.equals("")){
            StartScreen.startString = StartScreen.checkStart();
            if (StartScreen.startString != "") {
                break;
            }
        }

        if (StartScreen.startString.equals("START")) {
            DifficultyManager.difficultyFinal = DifficultyManager.getDifficulty(DifficultyManager.difficultyInput, DifficultyManager.difficultyFinal).toLowerCase();
            DifficultyManager.difficultyFinal = DifficultyManager.difficultyFinal.substring(0, 1).toUpperCase() + DifficultyManager.difficultyFinal.substring(1, DifficultyManager.difficultyFinal.length());

            DifficultyManager.numbersGiven = BoardMaker.getNumbersGiven(DifficultyManager.difficultyFinal);
            BoardMaker.printBoard();
        }
    }
}
