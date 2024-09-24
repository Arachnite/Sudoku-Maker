
import java.util.Scanner;
//import java.util.Arrays;

public class Constants {

    //Scanner variable for all files
    public static Scanner sc = new Scanner(System.in);

    //Start screen variables
    public static String startString = "0";
    public static String[] startMessage = {
        ("Welcome to Sudoku \n"),
        ("Rules:"),
        ("Numbers may not repeat per Row, Column or Box"),
        ("Select a difficulty first, and reply with the position and number wanted"),
        ("For example: A1 5\nThe First Letter = Row\nThe Second Number = Column\nLast Number = Number wanted to be Replaced\n"),
        ("Please type start to continue:")
    };

    //Declares the difficulty variables
    public static final String[] difficultyTypes = {"EASY", "MEDIUM", "HARD"};
    public static String difficultyFinal = "0";
    public static String difficultyInput;

    //Print methods
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

    public static void fflush(String x){
        System.out.print(x);
    }

    //Amount of numbers given
    public static int numbersGiven;

    //Physical Board
    public static int[][] theBoard = new int[9][9];
}
