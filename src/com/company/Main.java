package com.company;

import java.util.Scanner;

public class Main {
    static final int ZERO = 0;
    static final int BINARY = 2;
    static final int FIBONACCI_SERIES = 1;
    static final int PERFECT_NUMBER = 2;
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Logical Programming");
        System.out.println("Select Option to proceed");
        System.out.println("Enter 1 for Fibonnaci series");
        System.out.println("Enter 2 for Perfect Number");
        int option = scanner.nextInt();
        switch (option) {
            case FIBONACCI_SERIES:
                printFibonacciSeries();
                break;
            case PERFECT_NUMBER:
                isPerfectNumber();
                break;
        }
    }

    private static void isPerfectNumber() {
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        int i = 1;
        int factorsAggregate = 0;
        while (i <= number / 2) {
            factorsAggregate += (number % i == 0 ? i : 0);
            i += 1;
        }
        System.out.println(number == factorsAggregate ? "Perfect Number" : "Not a Perfect Number");
    }

    private static void printFibonacciSeries() {
        System.out.println("Enter a number to print fibonacci series");
        int limit = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        limit -= 2;
        while (limit > ZERO) {
            int temp = first + second;
            System.out.print(temp + " ");
            first = second;
            second = temp;
            limit -= 1;
        }
    }

    public static void toBinary(int decimalNumber) {
        String binaryRepresentation = "";
        while (decimalNumber > ZERO) {
            binaryRepresentation = (decimalNumber % BINARY) + binaryRepresentation;
            decimalNumber = decimalNumber / BINARY;
        }
        System.out.println(binaryRepresentation);
    }

}
