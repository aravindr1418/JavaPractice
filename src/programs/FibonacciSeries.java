package programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        if(num ==0)
        {
            System.out.println("Enter the number greater than zero");
        }
        else {
            fibonacci(num);
        }
    }
    static void fibonacci(int num){
        int a=0;
        int b= 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <num ; i++) {
             int temp = a+b;
            a =b;
            b = temp;
            System.out.println(temp );
        }

    }
}
