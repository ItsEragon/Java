import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Get Bit
        Get the third bit (position = 2) of a number n. (n = 0101)
         */

       int n = 5; //0101
       int pos = 2;
       int bitMask = 1<<pos;

       if ((bitMask & n) ==0) {
           System.out.println("bit was zero");
       } else {
           System.out.println("bit was one");
       }

        /* Set Bit
        Set the second bit (position = 1) of a number n. (n = 0101)
         */

       int n = 5; //0101
       int pos = 1;
       int bitMask = 1<<pos;

       int newNumber = bitMask | n;
       System.out.println(newNumber);


        /* Clear Bit
        Clear the third bit (position = 2) of a number n. (n = 0101)
         */

       int n = 5; //0101
       int pos = 2;
       int bitMask = 1<<pos;
       int notBitMask = ~(bitMask);

       int newNumber = notBitMask & n;
       System.out.println(newNumber);


        /* Update Bit
        update the second bit (position = 1) of a number n to 1. (n = 0101)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation (0/1): ");
        int oper = sc.nextInt(); //update bit to 1 else update bit to 0
        int n = 5; //0101
        int pos = 1;

        int bitMask = 1<<pos;
        if (oper ==1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
            
        }
    }
}
