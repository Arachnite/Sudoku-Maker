
import java.util.Scanner;
//import java.util.Arrays;

public class Constants {

    //Scanner variable for all files
    public static Scanner sc = new Scanner(System.in);
    public static String startString;
    public static String[] startMessage = {
        printf("Welcome to Sudoku \n");
        printf("Rules:");
        printf("Numbers may not repeat per Row, Column or Box");
        printf("Select a difficulty first, and reply with the position and number wanted");
        printf("For example: A1 5\nThe First Letter = Row\nThe Second Number = Column\nLast Number = Number wanted to be Replaced\n");
        "Please type start to continue:");
    }

    //Declares the difficulty variables
    public static final String[] difficultyTypes = {"EASY", "MEDIUM", "HARD"};
    public static String difficultyFinal = "0";
    public static String difficultyInput;

    //Print method
    public static void printf(String x){
        System.out.println(x);
    }

    public static void printf(int x){
        System.out.println(x);
    }

    public static void printf(float x){
        System.out.println(x);
    }

    public static void printf(double x){
        System.out.println(x);
    }

    //Numbers and Arrays used in relative to create the board

    //Numbers
    public static int numbersGiven;

    //All Positions

    public static int boardArray[][] = new int[9][9];

    //Physical Board
    public static String theBoard;
}
