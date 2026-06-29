package exercises.exercise08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();

        if (weight < 55 && age < 18 || age > 65) {
            System.out.println("The donor is not compatible.");
        } else {
            System.out.println("The donor is not compatible.");
        }
    }
}
