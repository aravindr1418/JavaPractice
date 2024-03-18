package programs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RemoveSpeciallCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        removeCharacters(str);

    }
    static void removeCharacters(String s){
        String S="";
        for (int i = 0; i < s.length() ; i++) {
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                S = S+(s.charAt(i));
            }
        }
        System.out.println(S);
    }

}
