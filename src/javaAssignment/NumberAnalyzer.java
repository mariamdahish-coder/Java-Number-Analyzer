
package javaAssignment;

import java.util.Scanner;

public class NumberAnalyzer {

    /**
     * Starts the Number Analyzer application.
     * Displays a menu and allows the user to select an operation.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            // Display the menu
            System.out.println("\n=========================");
            System.out.println("    Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd ");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Process the user's choice
            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    String result = checkNumberType(number);

                    System.out.println("Number Type: " + result);
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    int number1 = input.nextInt();

                    System.out.print("Enter the second number: ");
                    int number2 = input.nextInt();

                    int sum = calculateSum(number1, number2);

                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        input.close();
    }

    /**
     * Prints numbers in descending order, starting from 10 and ending at 1.
     */
    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

        }
    }

    /**
     * Displays numbers from 1 to 10 and identifies each number as even or odd.
     */
    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

                System.out.println(i + "  Even");

            } else {

                System.out.println(i + "  Odd");

            }
        }
    }

    /**
     * Determines whether the given number is positive, negative, or zero.
     *
     * @param number the integer entered by the user
     * @return a String describing the number type
     */
    public static String checkNumberType(int number) {

        if (number > 0) {

            return "Positive";

        } else if (number < 0) {

            return "Negative";

        } else {

            return "Zero";

        }
    }

    /**
     * Calculates the sum of two integer numbers.
     *
     * @param number1 the first integer
     * @param number2 the second integer
     * @return the sum of the two numbers
     */
    public static int calculateSum(int number1, int number2) {

        int sum = number1 + number2;

        return sum;
    }

}
