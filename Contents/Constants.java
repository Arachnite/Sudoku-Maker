import java.util.Scanner;

public class Constants {

    //Scanner variable for all files
    public static Scanner sc = new Scanner(System.in);

    //Declares the difficulty variables
    public static String difficultyFinal = "0";
    public static String difficultyInput;

    //Numbers and Arrays used in relative to create the board

    //Numbers
    public static int numbersGiven;

    //All Positions

    //Row A
    public static int a1;
    public static int a2;
    public static int a3;
    public static int a4;
    public static int a5;
    public static int a6;
    public static int a7;
    public static int a8;
    public static int a9;

    //Row B
    public static int b1;
    public static int b2;
    public static int b3;
    public static int b4;
    public static int b5;
    public static int b6;
    public static int b7;
    public static int b8;
    public static int b9;

    //Row C
    public static int c1;
    public static int c2;
    public static int c3;
    public static int c4;
    public static int c5;
    public static int c6;
    public static int c7;
    public static int c8;
    public static int c9;

    //Row D
    public static int d1;
    public static int d2;
    public static int d3;
    public static int d4;
    public static int d5;
    public static int d6;
    public static int d7;
    public static int d8;
    public static int d9;

    //Row E
    public static int e1;
    public static int e2;
    public static int e3;
    public static int e4;
    public static int e5;
    public static int e6;
    public static int e7;
    public static int e8;
    public static int e9;

    //Row F
    public static int f1;
    public static int f2;
    public static int f3;
    public static int f4;
    public static int f5;
    public static int f6;
    public static int f7;
    public static int f8;
    public static int f9;

    //Row G
    public static int g1;
    public static int g2;
    public static int g3;
    public static int g4;
    public static int g5;
    public static int g6;
    public static int g7;
    public static int g8;
    public static int g9;

    //Row H
    public static int h1;
    public static int h2;
    public static int h3;
    public static int h4;
    public static int h5;
    public static int h6;
    public static int h7;
    public static int h8;
    public static int h9;

    //Row I
    public static int i1;
    public static int i2;
    public static int i3;
    public static int i4;
    public static int i5;
    public static int i6;
    public static int i7;
    public static int i8;
    public static int i9;


    //All Arrays

    //Rows
    public static int row1[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9};
    public static int row2[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
    public static int row3[] = {c1, c2, c3, c4, c5, c6, c7, c8, c9};
    public static int row4[] = {d1, d2, d3, d4, d5, d6, d7, d8, d9};
    public static int row5[] = {e1, e2, e3, e4, e5, e6, e7, e8, e9};
    public static int row6[] = {f1, f2, f3, f4, f5, f6, f7, f8, f9};
    public static int row7[] = {g1, g2, g3, g4, g5, g6, g7, g8, g9};
    public static int row8[] = {h1, h2, h3, h4, h5, h6, h7, h8, h9};
    public static int row9[] = {i1, i2, i3, i4, i5, i6, i7, i8, i9};

    //Columns
    public static int column1[] = {a1, b1, c1, d1, e1, f1, g1, h1, i1};
    public static int column2[] = {a2, b2, c2, d2, e2, f2, g2, h2, i2};
    public static int column3[] = {a3, b3, c3, d3, e3, f3, g3, h3, i3};
    public static int column4[] = {a4, b4, c4, d4, e4, f4, g4, h4, i4};
    public static int column5[] = {a5, b5, c5, d5, e5, f5, g5, h5, i5};
    public static int column6[] = {a6, b6, c6, d6, e6, f6, g6, h6, i6};
    public static int column7[] = {a7, b7, c7, d7, e7, f7, g7, h7, i7};
    public static int column8[] = {a8, b8, c8, d8, e8, f8, g8, h8, i8};
    public static int column9[] = {a9, b9, c9, d9, e9, f9, g9, h9, i9};

    //Boxes
    public static int box1[] = {a1, a2, a3, b1, b2, b3, c1, c2, c3};
    public static int box2[] = {a4, a5, a6, b4, b5, b6, c4, c5, c6};
    public static int box3[] = {a7, a8, a9, b7, b8, b9, c7, c8, c9};
    public static int box4[] = {d1, d2, d3, e1, e2, e3, f1, f2, f3};
    public static int box5[] = {d4, d5, d6, e4, e5, e6, f4, f5, f6};
    public static int box6[] = {d7, d8, d9, e7, e8, e9, f7, f8, f9};
    public static int box7[] = {g1, g2, g3, h1, h2, h3, i1, i2, i3};
    public static int box8[] = {g4, g5, g6, h4, h5, h6, i4, i5, i6};
    public static int box9[] = {g7, g8, g9, h7, h8, h9, i7, i8, i9};

    //Physical Board
    public static String theBoard = a1 + " " + a2 + " " + a3 + " " + "|" + " " + a4 + " " + a5 + " " + a6 + " " + "|" + " " + a7 + " " + a8 + " " + a9 + "\n" + b1 + " " + b2 + " " + b3 + " " + "|" + " " + b4 + " " + b5 + " " + b6 + " " + "|" + " " + b7 + " " + b8 + " " + b9 + "\n" + c1 + " " + c2 + " " + c3 + " " + "|" + " " + c4 + " " + c5 + " " + c6 + " " + "|" + " " + c7 + " " + c8 + " " + c9 + "\n" + "- - - + - - - + - - -" + "\n" + d1 + " " + d2 + " " + d3 + " " + "|"  + " " + d4 + " " + d5 + " " + d6 + " " + "|"  + " " + d7 + " " + d8 + " " + d9 + "\n" + e1 + " " + e2 + " " + e3 + " " + "|"  + " " + e4 + " " + e5 + " " + e6 + " " + "|"  + " " + e7 + " " + e8 + " " + e9 + "\n" + f1 + " " + f2 + " " + f3 + " " + "|"  + " " + f4 + " " + f5 + " " + f6 + " " + "|"  + " " + f7 + " " + f8 + " " + f9 +  "\n" + "- - - + - - - + - - -" + "\n" + g1 + " " + g2 + " " + g3 + " " + "|"  + " " + g4 + " " + g5 + " " + g6 + " " + "|"  + " " + g7 + " " + g8 + " " + g9 + "\n" + h1 + " " + h2 + " " + h3 + " " + "|"  + " " + h4 + " " + h5 + " " + h6 + " " + "|"  + " " + h7 + " " + h8 + " " + h9 + "\n" + i1 + " " + i2 + " " + i3 + " " + "|"  + " " + i4 + " " + i5 + " " + i6 + " " + "|"  + " " + i7 + " " + i8 + " " + i9;
}
