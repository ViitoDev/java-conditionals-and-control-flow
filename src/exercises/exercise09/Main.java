package exercises.exercise09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acessCode = 2023;
        int minPermission = 1;
        int maxPermission = 3;

        System.out.println("Please enter your acess code:");
        int codeIntered = input.nextInt();

        System.out.println("Please enter your permission:");
        int permissionIntered = input.nextInt();

        boolean validCode = codeIntered == acessCode;
        boolean validPermission = permissionIntered > minPermission || permissionIntered < maxPermission;

        if (validCode && validPermission) {
            System.out.println("Acess granted");
        } else {
            System.out.println("Permission denied");
            if (!validCode) {
                System.out.println("Acess code denied.");
            }
            if (!validPermission) {
                System.out.println("Permission denied.");
            }
        }
    }
}
