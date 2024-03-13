package programs;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the first String.");
        String a = in.next();
        System.out.println("Enter the second String.");
        String b = in.next();
        System.out.println( isAnagram(a,b));
    }
    static boolean isAnagram(String a ,String b) {
        if (a.length() == b.length()) {
            int[] count = new int[256];
            for (int i = 0; i < a.length(); i++) {
                count[a.charAt(i)]++;
                count[b.charAt(i)]--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }

            }
            return true;
        } else {
            return false;
        }
    }

}
