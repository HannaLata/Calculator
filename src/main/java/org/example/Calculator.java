package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, x, /): ");
        String operator = scanner.next();

        System.out.print("Enter operand2: ");
        double operand2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "%":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Supported operators are +, -, x, and /.");
                System.exit(1);
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
