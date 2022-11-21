package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static final int ZERO = 0;
    static final int BINARY = 2;
    static final int FIBONACCI_SERIES = 1;
    static final int PERFECT_NUMBER = 2;
    static final int PRIME_NUMBER = 3;
    static final int REVERSE_NUMBER = 4;
    static final int DISTINCT_COUPON_NUMBER = 5;
    static final int STOP_WATCH = 6;
    static final int VENDING_MACHINE = 7;
    static final int DAY_OF_WEEK = 8;
    static final int TEMPERATURE_CONVERSION = 9;
    static final int SECONDS_CONVERSION_RATE = 1000;
    static final int MINIMUM_CURRENCY_EXCHANGE = 1;
    static final int RUPEES_1000 = 1000;
    static final int RUPEES_500 = 500;
    static final int RUPEES_100 = 100;
    static final int RUPEES_50 = 50;
    static final int RUPEES_10 = 10;
    static final int RUPEES_5 = 5;
    static final int RUPEES_2 = 2;
    static final int RUPEES_1 = 1;
    static final int FARHENHIET_TO_CELSIUS = 1;
    static final int CELSIUS_TO_FARHENHIET = 2;
    static final Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> currencyList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Logical Programming");
        System.out.println("Select Option to proceed");
        System.out.println("Enter 1 for Fibonnaci series");
        System.out.println("Enter 2 for Perfect Number");
        System.out.println("Enter 3 for Prime Number");
        System.out.println("Enter 4 for Reversing a Number");
        System.out.println("Enter 5 for Generating N distinct Coupon Numbers");
        System.out.println("Enter 6 for Stop Watch");
        System.out.println("Enter 7 for Vending Machine");
        System.out.println("Enter 8 for Day Of Week");
        System.out.println("Enter 9 for Temperature Conversion");
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
            case STOP_WATCH:
                simulateStopWatch();
                break;
            case VENDING_MACHINE:
                printMinimumCurrencyNotes();
                break;
            case DAY_OF_WEEK:
                printDayOfWeek();
                break;
            case TEMPERATURE_CONVERSION:
                convertTemperature();
                break;
        }
    }

    private static void convertTemperature() {
        System.out.println("Enter 1 for Farhenheit to Celsius , 2 for Celsius to Farhenheit");
        int option = scanner.nextInt();
        switch (option) {
            case FARHENHIET_TO_CELSIUS:
                convertFarhenhietToCelsius();
                break;
            case CELSIUS_TO_FARHENHIET:
                convertCelsiusToFarhenheit();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    private static void convertCelsiusToFarhenheit() {
        System.out.println("Enter Temperature in Celsius");
        double celsiusTemperature = scanner.nextDouble();
        double farhenheitTemperature = (celsiusTemperature * 9.0 / 5) + 32;
        System.out.println("Farhenheit Temperature=" + farhenheitTemperature);
    }

    private static void convertFarhenhietToCelsius() {
        System.out.println("Enter Temperature in Farhenheit");
        double farhenheitTemperature = scanner.nextDouble();
        double celsiusTemperature = (farhenheitTemperature - 32) * 5.0 / 9;
        System.out.println("Celsius Temperature=" + celsiusTemperature);
    }

    private static void printDayOfWeek() {
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;
        System.out.println(d0);

    }

    private static void printMinimumCurrencyNotes() {
        System.out.println("Enter Currency Note for Change");
        int rupees = scanner.nextInt();
        if (rupees < MINIMUM_CURRENCY_EXCHANGE) {
            System.out.println("Invalid Data");
            return;
        }
        recursiveNotesCalculator(rupees);
        System.out.println(currencyList + "," + currencyList.size());
    }

    private static void recursiveNotesCalculator(int rupees) {
        if (rupees > RUPEES_1000 || (rupees >= RUPEES_1000 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_1000);
            rupees -= RUPEES_1000;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_500 || (rupees >= RUPEES_500 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_500);
            rupees -= RUPEES_500;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_100 || (rupees >= RUPEES_100 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_100);
            rupees -= RUPEES_100;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_50 || (rupees >= RUPEES_50 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_50);
            rupees -= RUPEES_50;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_10 || (rupees >= RUPEES_10 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_10);
            rupees -= RUPEES_10;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_5 || (rupees >= RUPEES_5 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_5);
            rupees -= RUPEES_5;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_2 || (rupees >= RUPEES_2 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_2);
            rupees -= RUPEES_2;
            recursiveNotesCalculator(rupees);
            return;
        }
        if (rupees > RUPEES_1 || (rupees >= RUPEES_1 && currencyList.size() != 0)) {
            currencyList.add(RUPEES_1);
            rupees -= RUPEES_1;
            recursiveNotesCalculator(rupees);
            return;
        }
        return;
    }

    private static void simulateStopWatch() {
        System.out.println("Enter 1 to Start Watch , 2 to Stop Watch");
        int option = scanner.nextInt();
        long elapsedTime = ZERO;
        final int START_WATCH = 1;
        final int STOP_WATCH = 2;
        while (true) {
            if (option != START_WATCH) {
                System.out.println("Wrong input Enter 1 to start watch");
                option = scanner.nextInt();
                continue;
            }
            System.out.println("Watch Started");
            elapsedTime = new Date().getTime();
            break;
        }
        System.out.println("Enter 2 to stop the watch");
        option = scanner.nextInt();
        while (true) {
            if (option != STOP_WATCH) {
                System.out.println("Wrong input Enter 2 to stop watch");
                option = scanner.nextInt();
                continue;
            }
            System.out.println("Watch Stopped");
            break;
        }
        System.out.println((new Date().getTime() - elapsedTime) / SECONDS_CONVERSION_RATE + " seconds from start to stop");
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
