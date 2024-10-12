

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
            {randomNumber(1, 3), randomNumber(1, 3)}, 
            {randomNumber(1, 3), randomNumber(1, 3)}
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

        //Column Algorithm
        if(randomizer[1][0] == 1) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][2];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][2] = theBoard[i][1];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][1] = theBoard[i][0];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][0] = randomStorage[i];
            }
        } else if(randomizer[1][0] == 2) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][0];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][0] = theBoard[i][1];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][1] = theBoard[i][2];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][2] = randomStorage[i];
            }
        }

        if(randomizer[1][1] == 1) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][5];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][5] = theBoard[i][4];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][4] = theBoard[i][3];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][3] = randomStorage[i];
            }
        } else if(randomizer[1][1] == 2) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][3];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][3] = theBoard[i][4];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][4] = theBoard[i][5];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][5] = randomStorage[i];
            }
        }

        if(randomizer[1][2] == 1) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][8];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][8] = theBoard[i][7];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][7] = theBoard[i][6];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][6] = randomStorage[i];
            }
        } else if(randomizer[1][2] == 2) {
            for(int i = 0; i <= 8; i++) {
                randomStorage[i] = theBoard[i][6];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][6] = theBoard[i][7];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][7] = theBoard[i][8];
            }
            for(int i = 0; i <= 8; i++) {
                theBoard[i][8] = randomStorage[i];
            }
        }
    }
}
