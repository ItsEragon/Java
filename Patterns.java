import java.util.*;

public class Pattterns {
  
  // Same variables has been used multiple times in every pattern so make sure to try them one by one in order avoid any kind of errors.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Pattern - 1 - Rectangle

        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */

       System.out.println("Enter no of rows: ");
       int n = sc.nextInt();
       System.out.println("Enter no of columns: ");
       int m = sc.nextInt();

       //outer loop
       for (int i=1; i <= n; i++) {
           //inner loop
           for (int j=1; j <= m; j++){
               System.out.print("*");
           }
           System.out.println();

            /* Pattern - 2 - Hollow Rectangle

             * * * * *
             *       *
             *       *
             * * * * *

             */

       System.out.println("Enter no of rows: ");
       int n = sc.nextInt();
       System.out.println("Enter no of columns: ");
       int m = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //inner loop
           for (int j=1; j<=m; j++){
               //cell -> (i,j)
               if (i == 1 || j == 1 || i == n || j == m) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();

       }

        /* Pattern - 3 - Half Pyramid

         *
         * *
         * * *
         * * * *

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //inner loop
           for (int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

        /* Pattern - 4 - Inverted Half Pyramid

         * * * *
         * * *
         * *
         *

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=n; i>=1; i--) {
           //inner loop
           for (int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

        /* Pattern - 5 - Inverted Half Pyramid (rotated by 180 deg)

               *
             * *
           * * *
         * * * *

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

        outer loop
       for (int i=1; i<=n; i++) {
           //inner loop -> space print
           for (int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           //inner loop -> star print
           for (int j=1; j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

        /* Pattern - 6 - Half Pyramid with numbers

         1
         1 2
         1 2 3
         1 2 3 4

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //inner loop
           for (int j=1; j<=i; j++) {
               System.out.print(j+" ");
           }
           System.out.println();
       }

        /* Pattern - 6 - Inverted Half Pyramid with numbers

         1 2 3 4
         1 2 3
         1 2
         1

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();

       //outer loop
       for (int i=1; i<=n; i++) {
           //inner loop
           for (int j=1; j<=n-i+1; j++) {
               System.out.print(j);
           }
           System.out.println();
       }

        /* Pattern - 8 - Floyd's Triangle

         1
         2 3
         4 5 6
         7 8 9 10

         */

       System.out.println("Enter no: ");
       int n = sc.nextInt();
       int number = 1;

       //outer loop
       for (int i=1; i<=n; i++) {
           //inner loop
           for (int j=1; j<=i; j++) {
               System.out.print(number+" ");
               number++;
           }
           System.out.println();
       }

        /* Pattern - 9 - 0-1 Triangle

         1
         0 1
         1 0 1
         0 1 0 1

         */

        System.out.println("Enter no: ");
        int n = sc.nextInt();

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=i; j++) {
                int sum = i+j;
                if (sum % 2 == 0) { //even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
}
