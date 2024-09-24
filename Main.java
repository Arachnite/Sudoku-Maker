

public class Main {

    public static int[][] twoDArr = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public static void main(String[] args) {
        // Print the 2D array
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if(i == 2 || i == 5) {
                System.out.println("- - - + - - - + - - -");
            }
            
        }

    }

    // Compare a two values in the 2D array
    public static boolean compareTwoValues(int x1, int y1, int x2, int y2) {
        return twoDArr[x1][y1] == twoDArr[x2][y2];
    }

}
