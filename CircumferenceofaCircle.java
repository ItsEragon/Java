//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;
import java.lang.Math.*;

public class CircumferenceofaCircle {

    public static void circumferenceOfCircle(int radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of a circle having radius "+ radius +" is "+circumference);
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();

        circumferenceOfCircle(radius);
    }
}
