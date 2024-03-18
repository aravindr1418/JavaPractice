package programs;

import java.util.Scanner;

public class OccurenceOfaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your thoughts: ");
        String str = in.nextLine();
        System.out.println("Enter the letter to find its occurence:");
        char ch = in.next().trim().charAt(0);
        String s = String.valueOf(ch);
        int count = str.length();
        int aftercount = str.replace(s,"").length();
        int totalcount = count - aftercount;
        System.out.println(totalcount);
        //System.out.println("The occurence of character "+ch+" is "+occurence(str,ch));
    }
//    static int occurence(String str , char ch ){
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==ch){
//                count++;
//            }
//        }
//        return count;
//    }

}
