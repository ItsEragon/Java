import java.util.Scanner;

public class Main {

    public static void fibonacci(int n) {

        int a = 0, b = 1;

        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }

            System.out.println();
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter: ");
        int n = sc.nextInt();
        fibonacci(n);

    }
}
