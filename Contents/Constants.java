
import java.util.Scanner;
//import java.util.Arrays;

public class Constants {

    //Scanner variable for all files
    public static Scanner sc = new Scanner(System.in);

    //Declares the difficulty variables
    public static final String[] difficultyTypes = {"EASY", "MEDIUM", "HARD"};
    public static String difficultyFinal = "0";
    public static String difficultyInput;

    //Numbers and Arrays used in relative to create the board

    //Numbers
    public static int numbersGiven;

    //All Positions

    public static int boardArray[][] = new int[3][3];

    //Physical Board
    public static String theBoard;
}
