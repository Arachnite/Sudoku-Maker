

import java.lang.Math;

public class board extends Constants {
    public static void main(String[] args) {
        makeAlgorithm();
        BoardMaker.printBoard();
    }


    public static void makeAlgorithm() {
        randomizer = new int[]{randomNumber(1, 3), randomNumber(1, 3)};
    }
}
