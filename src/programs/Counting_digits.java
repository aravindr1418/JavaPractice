package programs;

import java.util.Scanner;

public class Counting_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int digit = countDigit(num);
        System.out.println(digit);
    }
    static int countDigit(int num){
        int count = 0;
        while (num>0){
            num =num /10;
            count++;
        }
        return count;
    }

}
