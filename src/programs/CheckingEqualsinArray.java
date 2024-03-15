package programs;

import java.util.Scanner;

public class CheckingEqualsinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int arr1Size = in.nextInt();
        System.out.println("Enter the first array elements:");
        int[] arr1 = new int[arr1Size];
        for (int i = 0; i < arr1Size ; i++) {
             arr1[i] = in.nextInt();
        }
        System.out.println("Enter the size of the Second array:");
        int arr2Size = in.nextInt();
        System.out.println("Enter the Second array elements:");
        int[] arr2 = new int[arr2Size];
        for (int i = 0; i < arr2Size ; i++) {
            arr2[i] = in.nextInt();
        }
        if(arr1Size==arr2Size){
        System.out.println(checkingEqualorNot(arr1,arr2));}
        else{
            System.out.println("false");
        }
    }
    static boolean checkingEqualorNot(int[] arr1,int[] arr2){


            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i])
                    return false;}
        return true;

        }

    }

