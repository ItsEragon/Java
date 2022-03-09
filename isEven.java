//Make a function to check if a given number n is even or not.

import java.util.*;

public class isEven {

    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n+" is an even number");
        } else {
            System.out.println(n+" is an odd number");
        } return ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        isEven(n);

    }
}
