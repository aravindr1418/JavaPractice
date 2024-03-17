package programs;

import java.util.Scanner;

public class SearchingElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int n = in.nextInt();
        System.out.println("Enter the array values:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();

        }
        System.out.println("Enter the target value:");
        int target = in.nextInt();

        System.out.println("The target value of index is "+binarySearch(arr,n,target));
    }
    static int binarySearch(int [] arr,int n,int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
