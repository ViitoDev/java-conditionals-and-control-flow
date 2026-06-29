package exercises.exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Loan amount : ");
        double loanAmount = input.nextDouble();

        if (loanAmount < 1000 ||  loanAmount > 5000) {
            System.out.println("The value " +  loanAmount + " is not within the permitted range for the loan.");
        } else {
            System.out.println("The value " +  loanAmount + " is within the permitted range.");
        }
    }
}
