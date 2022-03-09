//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.Scanner;

public class Main {

    public static void greatestCommonDivisor(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("Greatest common divisor is : "+ n2);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter first number: ");
        int n2 = sc.nextInt();

        greatestCommonDivisor(n1,n2);

    }
}
