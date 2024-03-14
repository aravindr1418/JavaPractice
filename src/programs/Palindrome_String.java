package programs;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to check whether it is palindrome or not: ");
        String name = in.next();
        System.out.println(isPalindrome(name));

    }
    static boolean isPalindrome(String name){
        String reverse = "";
        for (int i = name.length()-1; i >=0; i--) {
            reverse = reverse + name.charAt(i);
        }
        for (int i = 0; i < name.length(); i++) {
            if(reverse.charAt(i)!=name.charAt(i)) {
                return false;
            }
        }
        return true;

    }
}
