package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array.");
        int n = in.nextInt();
        System.out.print("Enter the values of the array.");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]= in.nextInt();
        }
        System.out.println("The sum of arrray is"+sum(arr,n));
    }
    static int sum (int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
           sum += arr[i];

        }
        return sum;
    }
}
