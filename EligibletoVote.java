//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class EligibletoVote {

    public static void eligibleToVote(int age) {
        if (age > 18) {
            System.out.println("You're eligible to vote");
        } else {
            System.out.println("You're not eligible to vote");
        } return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        eligibleToVote(age);

    }
}
