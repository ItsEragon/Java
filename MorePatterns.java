import java.util.Scanner;

public class MorePatterns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Pattern - 10 - Butterfly Pattern

         *             *
         * *         * *
         * * *     * * *
         * * * * * * * *
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //Upper half
       for (int i=1; i<=n; i++) {
           //First Part
           for (int j=1; j<=i; j++) {
               System.out.print("*");
               }

           //Spaces
           int spaces = 2 * (n-i);
           for (int j=1; j<=spaces;j++) {
               System.out.print(" ");
           }

           //Second Part
           for (int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();

       }
       //Lower
       for (int i=n; i>=1; i--) {
           //First Part
           for (int j=1; j<=i; j++) {
               System.out.print("*");
           }

           //Spaces
           int spaces = 2 * (n-i);
           for (int j=1; j<=spaces;j++) {
               System.out.print(" ");
           }

           //Second Part
           for (int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();

       }

//        /* Pattern - 11 - Solid Rhombus
//
//                 * * * * *
//               * * * * *
//             * * * * *
//           * * * * *
//         * * * * *
//
//         */
//
       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //spaces
           for (int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           //stars
           for (int j=1; j<=n; j++){
               System.out.print("*");
           }
           System.out.println();
       }

        /* Pattern - 12 - Number Pyramid

               1
             2  2
            3  3  3
           4  4  4  4
          5  5  5  5  5

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //spaces
           for (int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           //numbers -> print row no, row no of times
           for (int j=1; j<=i; j++){
               System.out.print(i+ " ");
           }
           System.out.println();
       }

        /* Pattern - 13 - Palindromic Pattern

                 1
               2 1 2
             3 2 1 2 3
           4 3 2 1 2 3 4
         5 4 3 2 1 2 3 4 5

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //spaces
           for (int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           //first-half numbers
           for (int j=i; j>=1; j--){
               System.out.print(j);
           }
           //second-half numbers
           for (int j=2; j<=i;j++) {
               System.out.print(j);
           }
           System.out.println();
       }

        /* Pattern - 14 - Diamond Pattern

         *
         * * *
         * * * * *
         * * * * * * *
         * * * * * * *
         * * * * *
         * * *
         *

         */

        System.out.println("Enter no: ");
        int n = sc.nextInt();

        //upper-half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower-half
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
