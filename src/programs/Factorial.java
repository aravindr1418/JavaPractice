package programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isFactorial(num));
    }
    static int isFactorial(int num) {

        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac = i * fac;
        }
            return fac;

    }
}
