package programs;

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = in.next();

        System.out.println("The reversed String is "+reverseString(name));
    }
    public static String reverseString(String name){
        String reverse ="";
        for (int i = name.length()-1; i >=0 ; i--) {

            reverse = reverse + name.charAt(i);

        }
        return reverse;
    }

}
