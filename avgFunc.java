//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class avgFunc {

    public static void avgfunc(int a, int b, int c) {

        int average = (a + b + c)/2;
        System.out.println("The average is "+average);
        return;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        avgfunc(a,b,c);
    }
}
