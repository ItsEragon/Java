import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int[] marks = new int[3];
       int marks[] = new int[3];
       int marks[] = {97, 98, 95};

       marks[0] = 97; //Phy marks
       marks[1] = 98; //Chem marks
       marks[2] = 95; //maths marks

       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(marks[2]);

       for (int i = 0; i < 3; i++) {
           System.out.println(marks[i]);
       }

       System.out.print("Enter size: ");
       int size = sc.nextInt();

       int numbers[] = new int[size];

       //input
       for (int i=0;i<size;i++) {
           System.out.print("Enter: ");
           numbers[i]=sc.nextInt();
       }
       //output
       for (int i=0;i<size;i++) {
           System.out.println(numbers[i]);
       }

//        1. Take an array of names as input from the user and print them on the screen.

       System.out.print("Enter array size: ");
       int size = sc.nextInt();

       String names[] = new String[size];

       for (int i=0; i<size;i++){
           System.out.print("Enter name: ");
           names[i] = sc.next();
       }

       for (int i=0; i< names.length;i++){
           System.out.println(names[i]);
       }

//        2. Find the maximum & minimum number in an array of integers.

       System.out.print("Array size: ");
       int size = sc.nextInt();

       int integers[] = new int[size];

       for (int i=0;i<size;i++) {
           System.out.print("Enter: ");
           integers[i] = sc.nextInt();
       }

       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

       for (int i=0; i<integers.length;i++){
           if (integers[i] < min){
               min = integers[i];
           }
           if (integers[i] > max){
               max = integers[i];
           }
       }
       System.out.println("Max number is " + max);
       System.out.println("Min number is " + min);

//        3. Take an array of numbers as input and check if it is an array sorted in ascending order.

        System.out.print("Array size: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter: ");
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 1; i <numbers.length - 1 ; i++){
            if (numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
