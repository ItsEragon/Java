import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        for (int i =0; i < size; i++) {
            System.out.print("Enter: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter search element: ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x+" found at index "+i);
            }
        }

    }
}
