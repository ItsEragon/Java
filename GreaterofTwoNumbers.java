//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Main {

    public static void greaterofTwo (int a, int b) {
        if (a == b) {
            System.out.println("Both the numbers are equal");
        } else if (a > b) {
            System.out.println(a + " is greater then " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        greaterofTwo(a,b);

    }
}
