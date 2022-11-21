package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final int ZERO = 0;
    static final int BINARY = 2;
    static final int FIBONACCI_SERIES = 1;
    static final int PERFECT_NUMBER = 2;
    static final int PRIME_NUMBER = 3;
    static final int REVERSE_NUMBER = 4;
    static final int DISTINCT_COUPON_NUMBER = 5;
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Logical Programming");
        System.out.println("Select Option to proceed");
        System.out.println("Enter 1 for Fibonnaci series");
        System.out.println("Enter 2 for Perfect Number");
        System.out.println("Enter 3 for Prime Number");
        System.out.println("Enter 4 for Reversing a Number");
        System.out.println("Enter 5 for Generating N distinct Coupon Numbers");
        int option = scanner.nextInt();
        switch (option) {
            case FIBONACCI_SERIES:
                printFibonacciSeries();
                break;
            case PERFECT_NUMBER:
                isPerfectNumber();
                break;
            case PRIME_NUMBER:
                isPrimeNumber();
                break;
            case REVERSE_NUMBER:
                printReverseOfANumber();
                break;
            case DISTINCT_COUPON_NUMBER:
                printNDistinctCouponNumbers();
                break;
        }
    }

    private static void printNDistinctCouponNumbers() {
        System.out.println("Enter a Number ");
        int number = scanner.nextInt();
        ArrayList<Integer> couponsList = new ArrayList<>();
        int uniqueMultiple = 10 * number;
        while (couponsList.size() != number) {
            Integer randomNumber = (int) Math.floor((Math.random() * uniqueMultiple) % uniqueMultiple) + 1;
            if (couponsList.size() == 0 || !couponsList.contains(randomNumber)) {
                couponsList.add(randomNumber);
            }
        }
        System.out.println(couponsList);
    }

    private static void printReverseOfANumber() {
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reverse);
    }

    private static void isPrimeNumber() {
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Invalid Input");
            return;
        }
        int factors = 2;
        for (int i = 2; i <= number / 2; i += 1) {
            if (number % i == 0) {
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime Number");
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
