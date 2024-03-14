package programs;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = in.nextInt();
        System.out.println("Enter the second number:");
        int b = in.nextInt();
         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println("The value of a is "+ a+" "+"The value of b is "+b);

    }

}
