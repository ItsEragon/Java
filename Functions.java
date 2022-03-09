import java.util.Scanner;

public class Main {
    
    // Same variables has been used multiple times in every pattern so make sure to try them one by one in order avoid any kind of errors.

    // 1. Print a given name in function
  
   public static void printMyName(String name) { //function declared
       System.out.println(name);
       return;
   }

    // 2. Make a function to add two numbers and return the sum

   public static int calculateSum(int a, int b) {
       int sum = a + b;
       return sum;
   }

    // 3. Make a function to multiply two numbers and return the product

   public static int calculateProduct(int a, int b) {
       return a*b;
   }

    // 4. Find the factorial of a number

   public static void printFactorial(int n) {

       if (n < 0) {
           System.out.println("Invalid input");
           return;
       }

       //loop
       int factorial = 1;
       for (int i=n; i>=1; i--) {
           factorial = factorial*i;
       }
       System.out.println(factorial);
       return;

    // 5. Write an infinite loop using do while condition.

    public static void infiniteLoop(){
        boolean print = true;
        do {
            System.out.println("Hello World");
        } while (print != false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String name = sc.next();

       printMyName(name); //function called

       Sum of two numbers
       int a = sc.nextInt();
       int b = sc.nextInt();

       int sum = calculateSum(a,b);
       System.out.println("Sum of two numbers is: "+ sum);

       Product of two numbers
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Product of two numbers is: "+ calculateProduct(a,b));

        Factorial
       System.out.println("Enter a number: ");
       int n = sc.nextInt();

       printFactorial(n);

        //Infinite Do while loop using function

        infiniteLoop();

    }
}
