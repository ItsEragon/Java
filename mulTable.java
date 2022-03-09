//Make a function to print the table of a given number n.

import java.util.*;

public class mulTable {

    public static void mulTable(int n) {
        for (int i=1; i<=10; i++){
            System.out.println(n +" * "+ i +" = "+ n*i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        mulTable(n);

    }
}
