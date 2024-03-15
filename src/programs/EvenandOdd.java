package programs;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = in.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            arr[i] = in.nextInt();
        }
        findingEvenandOdd(arr,size);
    }
    static void findingEvenandOdd(int[]arr,int size){
        int[] even = new int[size];
        int[] odd = new int[size];
        int j = 0;
        int z = 0;
        for (int i = 0; i < size ; i++) {
            if(arr[i]%2==0){
                even[j] =  arr[i];
                j++;
            }
            else {
                odd[z] = arr[i];
                z++;
            }
        }
        System.out.print("The even array is ");
        for (int i = 0; i <j ; i++) {
            System.out.print(even[i]+" ");
        }
        System.out.print("");
        System.out.print("The odd array is ");
        for (int i = 0; i <z ; i++) {
            System.out.print(odd[i]+" ");
        }

    }
}
