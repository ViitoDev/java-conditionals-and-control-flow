package exercises.exercise04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1 : ");
        double number1 = input.nextDouble();
        System.out.println("Enter the number 2 : ");
        double number2 = input.nextDouble();

        if (number1 > number2) {
            System.out.println("The number 1 is greater than to than the number 2");
        } else if (number1 < number2) {
            System.out.println("The number 1 is less than the number 2");
        } else {
            System.out.println("The number 1 is equal to the number 2");
        }
    }
}
