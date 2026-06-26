package exercises.exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 123456;

        System.out.println("Enter your password: ");
        int passwordGuess = input.nextInt();

        if (password == passwordGuess) {
            System.out.println("Password Correct!");
        } else  {
            System.out.println("Password Wrong!");
        }
    }
}
