package exercises.exercise06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week (in lowercase letters):");
        String day = input.nextLine();

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println(day + " is a business day.");
        } else {
            System.out.println(day + " is not a business day.");
        }
    }
}
