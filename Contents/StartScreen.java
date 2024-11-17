

public class StartScreen extends Constants{
    
    public static void printStartScreen() {
        for (int i = 0; i <= startMessage.length - 1; i++) {
            printf(startMessage[i] + "\n");
        }
    }

    public static String checkStart(){
        while (true) {
            startString = sc.nextLine().toUpperCase();
            if (startString.equals("START")){
                return startString;
            } else {
                return "x";
            }
        }
    }
}
