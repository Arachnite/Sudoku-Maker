

import java.util.Scanner;
import java.lang.Math;

public class Constants {

    //Scanner variable for all files
    public static Scanner sc = new Scanner(System.in);

    //Random Number function for all files
    public static int randomNumber(int min, int max) {
        return (int)((Math.random() + 0.1)* (max - min) + min);
    }

    //Start screen variables
    public static String startString = "";
    public static String[] startMessage = {
        ("\nWelcome to Sudoku\n"),
        ("Rules:"),
        ("Fill in the 3x3 by 3x3 box with all the numbers"),
        ("Numbers may not repeat per Row, Column or Box"),
        ("Select a difficulty first, and reply with the position and number wanted"),
        ("For example: 11 5"),
        ("The First Number = Row"),
        ("The Second Number = Column"),
        ("Last Number = Number wanted to be Replaced\n"),
        ("Please type start to continue:")
    };

    //Declares the difficulty variables
    public static final String[] difficultyTypes = {"EASY", "MEDIUM", "HARD"};
    public static String difficultyFinal = "0";
    public static String difficultyInput;

    //Print methods
    public static void printf(String x){
        System.out.print(x);
    }

    public static void printf(int x){
        System.out.print(x);
    }

    public static void printf(float x){
        System.out.print(x);
    }

    public static void printf(double x){
        System.out.print(x);
    }

    //Amount of numbers given
    public static int numbersGiven;

    //Physical Board
    public static int[][] theBoard = new int[][] {
        {1, 2, 3, 4, 5, 6, 7 ,8, 9},
        {4, 5, 6, 7 ,8, 9, 1, 2, 3},
        {7, 8, 9, 1, 2, 3, 4, 5, 6},
        {2, 3, 4, 5, 6, 7 ,8, 9, 1},
        {5, 6, 7 ,8, 9, 1, 2, 3, 4},
        {8, 9, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7 ,8, 9, 1, 2},
        {6, 7 ,8, 9, 1, 2, 3, 4, 5},
        {9, 1, 2, 3, 4, 5, 6, 7 ,8}
    };
    public static int[][] randomizer = new int[0][0];
    public static int[] randomStorage = new int[9];
    public static int number;
}
