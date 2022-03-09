import java.util.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no: ");
        int a = sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();
        System.out.println("Enter operator(+,-,*,/,%)");
        char c = sc.next().charAt(0);

        int o = 0;

        switch (c) {

            case '+':
                o = a + b;
                System.out.println(a + " " + c + " " + b + " = " + o);
                break;

            case '-':
                o = a - b;
                System.out.println(a + " " + c + " " + b + " = " + o);
                break;

            case '*':
                o = a * b;
                System.out.println(a + " " + c + " " + b + " = " + o);
                break;

            case '/':
                o = a / b;
                System.out.println(a + " " + c + " " + b + " = " + o);
                break;

            case '%':
                o = a % b;
                System.out.println(a + " " + c + " " + b + " = " + o);
                break;

            default:
                System.out.println("Wrong input");
                break;
        }




    }
}
