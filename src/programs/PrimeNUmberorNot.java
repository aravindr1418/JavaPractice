package programs;

import java.util.Scanner;

public class PrimeNUmberorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean bool = (isPrime(n));
        if(bool)
            System.out.println("prime");
        else
            System.out.println("not a prime");
    }
   static boolean isPrime(int n){
        if(n == 2 ||n ==3)
            return true;
        else {
            if (n % 2 ==0  || n%3 ==0)
                return false;
            else
                return true;
            }
        }
    }


