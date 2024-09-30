
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
            for (int p = 0; p <= 8; p++) {
                
            }
        }
    }
}
