
import java.util.Scanner;

public class StartScreen extends Constants{
    
    public static void printStartScreen() {
        for (int i = 0; i <= startMessage.length - 1; i++) {
            if (i == startMessage.length - 1) {

            }
            printf(startMessage[i] + "\n");
        }
    }

    public static String checkStart(){
        while (true) {
            startString = getStartString(sc);
            if (startString.equals("START")){
                return startString;
            } else {
                return "0";
            }
        }
    }

    public static String getStartString(Scanner sc){
        startString = sc.nextLine().toUpperCase(); 
        return startString;
    }
}
