//Make a function to check if a number is prime or not.

import java.awt.desktop.SystemEventListener;
import java.util.*;

public class isPrime {

    public static boolean isPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        } return isPrime;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

        boolean output = isPrime(n);

        if (output) {
            if (n==1) {
                System.out.println("Neither prime nor composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }

        }
    }
