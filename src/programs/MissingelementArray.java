package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingelementArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int num = in.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The missing number is "+missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        int n = arr.length+1;
        int sum2 = (n*(n+1))/2;
        return sum2-sum;
    }
}
