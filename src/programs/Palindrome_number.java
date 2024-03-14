package programs;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int n ){
        int a = n;
        int reverse = 0;
        while(n>0){
            int rem = n %10;
            reverse = (reverse * 10)+rem;
            n /=10;
        }
        if (a == reverse){
            return true;
        }
        return false;
    }
}
