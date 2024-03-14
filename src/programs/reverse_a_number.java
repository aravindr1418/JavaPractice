package programs;

import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int n = in.nextInt();
        System.out.println("The reversed number is "+reverse(n));
    }
    static int reverse(int n){
        int reverse = 0;
        while(n>0){
            int rem = n %10;
            reverse = (reverse*10)+rem;
            n = n/10;
        }
        return reverse;
    }
}
