package programs;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));
        stringDuplicate(arr);
    }
    public static void stringDuplicate(String[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("No duplicate elements in this array.");
        }
    }
}
