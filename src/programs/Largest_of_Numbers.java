package programs;

import java.util.Scanner;

public class Largest_of_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = in.nextInt();
        int max = maximumNumber(num1,num2,num3);
        System.out.println("The largest number is "+max);
    }
    static int maximumNumber(int num1,int num2,int num3){
        int max = num1;
        if(num2>num1){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        return max;
    }
}
