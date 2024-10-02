
//import java.util.scanner;
import java.lang.Math;
//import Contents.Constants;

public class board extends Constants {
    public static void main(String[] args) {
        makeAlgorithm();
        BoardMaker.printBoard();
    }


    public static void makeAlgorithm() {
        // for (int i = 0; i <= theBoard.length - 1; i++) {
        //     for (int o = 0; o <= theBoard[i].length - 1; o++) {    
        //         theBoard[i][o] = getNumber(i, o);
        //     }
        // }
        int i = 0;
        int o = 0;
        theBoard[i][o] = getNumber(i, o);
        theBoard[i][1] = getNumber(i, 1);
        
    }

    public static int getNumber(int i, int o) {
        while(true) {
            number = (int)(Math.random() * (max - min) + min);
            if(number == theBoard[i][0]) {
                checkNumber1 = false;
            }
            if(checkNumber1 == true) {
                return number;
            }
        }
    }
}
