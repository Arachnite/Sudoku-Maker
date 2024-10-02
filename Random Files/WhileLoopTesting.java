
import java.lang.Math;


public class WhileLoopTesting {
    public static void main(String[] args) {
        System.out.println(whileLoop());
    }












    public static int whileLoop() {
        while(true) {
            int x = (int)(Math.random() * (8) + 1);
            if (x > 8) {
                return x;
            }
            return 0;
        }
    }
}
