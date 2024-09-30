
//import java.util.scanner;
import java.util.Arrays;
import java.lang.Math;

public class board extends Constants {
    public static void main(String[] args) {
        makeAlgorithm();
        BoardMaker.printBoard();
    }


    public static void makeAlgorithm() {
        for (int i = 0; i <= theBoard.length - 1; i++) {
            for (int o = 0; o <= theBoard[i].length - 1; o++) {    
                theBoard[i][o] = getNumber(i, o);
            }
        }
    }

    public static int getNumber(int i, int o) {
            while (true) { 
                int x = (int)(Math.random() * (max - min) + min);
                for (int p = 0; p <= 9 - 1; p++) {
                    if (x != theBoard[i][p]) {
                        for (int q = 0; q <= 9 - 1; q++) {
                            if (x != theBoard[q][o]) {
                                if (i != 1 - 1) {
                                    for (int w = i - 1; w <= i + 1; w++) {
                                        if (o == 1 - 1 || o == 2 - 1 || o == 3 - 1) {
                                            for (int e = 1 - 1; e <= 3 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                        if (o == 4 - 1 || o == 5 - 1 || o == 6 - 1) {
                                            for (int e = 4 - 1; e <= 6 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                        if (o == 7 - 1 || o == 8 - 1 || o == 9 - 1) {
                                            for (int e = 7 - 1; e <= 9 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                    }
                                } else if (i == 1 - 1) {
                                    for (int w = i; w <= i + 1; w++) {
                                        if (o == 1 - 1 || o == 2 - 1 || o == 3 - 1) {
                                            for (int e = 1 - 1; e <= 3 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                        if (o == 4 - 1 || o == 5 - 1 || o == 6 - 1) {
                                            for (int e = 4 - 1; e <= 6 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                        if (o == 7 - 1 || o == 8 - 1 || o == 9 - 1) {
                                            for (int e = 7 - 1; e <= 9 - 1; e++) {
                                                if (x != theBoard[w][e]) {
                                                    return x;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }
}
