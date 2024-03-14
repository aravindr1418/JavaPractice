package programs;

import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = sumofNumbers(num);
        System.out.println("The sum of the number is "+sum);
    }
    static int sumofNumbers(int num){
        int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num /= 10;
        }
        return sum;
    }
}
