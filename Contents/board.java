

import java.lang.Math;

public class board extends Constants {
    public static void main(String[] args) {
        makeAlgorithm();
        BoardMaker.printBoard();
    }


    public static void makeAlgorithm() {
        randomizer = new int[][] {
            {randomNumber(1, 3), randomNumber(1, 3), randomNumber(1, 3)}, 
            {randomNumber(1, 3), randomNumber(1, 3), randomNumber(1, 3)}, 
            {randomNumber(1, 3), randomNumber(1, 3), randomNumber(1, 3)}, 
            {randomNumber(1, 3), randomNumber(1, 3), randomNumber(1, 3)}
        };
        if(randomizer[0][0] == 1) {
            randomStorage = theBoard[2];
            theBoard[2] = theBoard[1];
            theBoard[1] = theBoard[0];
            theBoard[0] = randomStorage;
        } else if(randomizer[0][0] == 2) {
            randomStorage = theBoard[0];
            theBoard[0] = theBoard[1];
            theBoard[1] = theBoard[2];
            theBoard[2] = randomStorage;
        }

        if(randomizer[0][1] == 1) {
            randomStorage = theBoard[5];
            theBoard[5] = theBoard[4];
            theBoard[4] = theBoard[3];
            theBoard[3] = randomStorage;
        } else if(randomizer[0][1] == 2) {
            randomStorage = theBoard[3];
            theBoard[3] = theBoard[4];
            theBoard[4] = theBoard[5];
            theBoard[5] = randomStorage;
        }

        if(randomizer[0][0] == 1) {
            randomStorage = theBoard[8];
            theBoard[8] = theBoard[7];
            theBoard[7] = theBoard[6];
            theBoard[6] = randomStorage;
        } else if(randomizer[0][0] == 2) {
            randomStorage = theBoard[6];
            theBoard[6] = theBoard[7];
            theBoard[7] = theBoard[8];
            theBoard[8] = randomStorage;
        }

        // if(randomizer[1] == 1) {

        // } else if(randomizer[1] == 2) {
            
        // }

        // if(randomizer[2] == 1) {

        // } else if(randomizer[2] == 2) {
            
        // }

        // if(randomizer[3] == 1) {

        // } else if(randomizer[3] == 2) {

        // }
    }
}
