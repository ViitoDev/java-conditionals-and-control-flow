package exercises.exercise05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = input.nextDouble();

        if (purchaseAmount >= 100){
            double purchaseAmountDiscount = (purchaseAmount * 0.1);
            double finalPrice = purchaseAmount - purchaseAmountDiscount;
            System.out.println("Discount applied!");
            System.out.println("Final value is : " + finalPrice);
        } else {
            System.out.println("No discount applied.");
            System.out.println("Final value is : " + purchaseAmount);
        }
    }
}
