//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x raised to the power n.

import java.util.Scanner;

public class Main {

    public static void powerFunction(int x, int n) {
        int power = 1;

        for (int i=0; i<n; i++) {
            power = power * x;
        }

        System.out.println(x+" to the power "+ n +" is "+ power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        powerFunction(x,n);
    }
}
