package programs;

import java.util.Random;

public class GeneratingRandomNumber {
    public static void main(String[] args) {
            Random rand = new Random();
        System.out.println(rand.nextInt(100));
    }
}
