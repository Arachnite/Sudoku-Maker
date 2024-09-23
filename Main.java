

public class Main {

    public static int[][] twoDArr = {{1, 2, 3}, {1, 2, 3,}};

    public static void main(String[] args) {
        int j = 0;
        // Print the 2D array
        for (int i = 0; i < twoDArr.length; i++) {
            System.out.print(i + " ");
            System.out.println(j);
            for (j = 0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Compare a two values in the 2D array
    public static boolean compareTwoValues(int x1, int y1, int x2, int y2) {
        return twoDArr[x1][y1] == twoDArr[x2][y2];
    }
}
