package programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReversingWordsInaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = in.nextLine();
        reversingWordsInaString(str);
    }
    public static void reversingWordsInaString(String str){
        int count2 =0;
        int c = 0;
        int j = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==32){
                count2++;

                    int temp = j;
                    int end = i-1;
                    reverse(temp,end,str);
                    System.out.print("");
                    c++;
                    j=i;

            }
        }
    }
    public static void reverse(int start,int end,String str){
        for (int i = end+1; i >start-1 ; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
