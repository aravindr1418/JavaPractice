package programs;

import java.util.Objects;
import java.util.Scanner;

public class CountingWordsInaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        System.out.println( "The Number of words in this string is "+countingWords(str));
    }
    static int countingWords(String str){
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 32 ){
                count++;
            }
        }
        return count+1;
    }
}
