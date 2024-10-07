
//import java.util.scanner;
import java.lang.Math;
//import Contents.Constants;

public class board extends Constants {
    public static void main(String[] args) {
        makeAlgorithm();
        BoardMaker.printBoard();
    }


    public static void makeAlgorithm() {
        for (int i = 0; i <= 7; i++) {
            for (int o = 0; o <= 7; o++) {    
                theBoard[i][o] = getNumber(i, o);
                BoardMaker.printBoard();
            }
        }
    }

    public static int getNumber(int i, int o) {
        while(true) {
            number = (int)((Math.random() + 0.1) * (max - min) + min); 

            checkNumber = checkRowsColumns(i, o);

            // if(i == 0 || i == 1 || i == 2) {
            //     if(o == 0 || o == 1 || o == 2) {
            //         for(int q = 0; q <= 2; q++) {
            //             for(int w = 0; w <= 2; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 3 || o == 4 || o == 5) {
            //         for(int q = 0; q <= 2; q++) {
            //             for(int w = 3; w <= 5; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 6 || o == 7 || o == 8) {
            //         for(int q = 0; q <= 2; q++) {
            //             for(int w = 6; w <= 8; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     }
            // } else if(i == 3 || i == 4 || i == 5) {
            //     if(o == 0 || o == 1 || o == 2) {
            //         for(int q = 3; q <= 5; q++) {
            //             for(int w = 0; w <= 2; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 3 || o == 4 || o == 5) {
            //         for(int q = 3; q <= 5; q++) {
            //             for(int w = 3; w <= 5; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 6 || o == 7 || o == 8) {
            //         for(int q = 3; q <= 5; q++) {
            //             for(int w = 6; w <= 8; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     }
            // } else if(i == 6 || i == 7 || i == 8) {
            //     if(o == 0 || o == 1 || o == 2) {
            //         for(int q = 6; q <= 8; q++) {
            //             for(int w = 0; w <= 2; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 3 || o == 4 || o == 5) {
            //         for(int q = 6; q <= 8; q++) {
            //             for(int w = 3; w <= 5; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     } else if(o == 6 || o == 7 || o == 8) {
            //         for(int q = 6; q <= 8; q++) {
            //             for(int w = 6; w <= 8; w++) {
            //                 if(number == theBoard[i][o]) {
            //                     checkNumber1 = false;
            //                 }
            //             }
            //         }
            //     }
            // }

            if(checkNumber == true) {
                return number;
            }
        }
    }

    public static boolean checkRowsColumns(int i, int o) {

        for(int g = 0; g <= theBoard[i].length - 1; g++) {
            if(number == theBoard[i][g]) {
                return false;
            }
        }

        for(int h = 0; h <= theBoard.length - 1; h++) {
            if(number == theBoard[h][o]) {
                return false;
            }
        }

        return true;
    }
}
