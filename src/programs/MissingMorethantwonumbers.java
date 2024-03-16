package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MissingMorethantwonumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int num = in.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        missingNumber(arr);
    }

    static void missingNumber(int[] arr) {
        int i = arr[0];
        int j = arr[(arr.length) - 1];
        int[] arr2 = new int[j];
        for (int k = i, n = 0; k < arr2.length + 1; n++) {
            arr2[n] = k;
            k++;
        }

     System.out.println(Arrays.toString(arr2));


        int a = arr2.length;
//       int [] arr3 = new int[a];
        int[] arr4 = new int[a];
        for (int k = 0; k < arr.length; k++) {
            arr4[k] = arr[k];
        }
     System.out.println(Arrays.toString(arr4));
//        int m =0;
//          int n=0;
//        for (int k = 0; k < arr4.length ; k++) {
//            if(arr2[k]!=arr4[n]){
//                arr3[m] =arr2[k];
//              if(arr2[k]==arr4[m]){
//                n++;
//               }
//                m++;
//            }
//        }
        for (int k = 0; k < arr4.length; k++) {
            int count = 0;
            for (int l = 0; l < arr4.length; l++) {

                if (arr2[k] == arr4[l]) {
                  count++;
                }
            }
            if(count== 0){
                System.out.print(arr2[k]+" ");
            }


        }
    }
}
