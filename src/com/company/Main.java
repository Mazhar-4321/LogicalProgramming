package com.company;

public class Main {
    static final int ZERO = 0;
    static final int BINARY = 2;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Logical Programming");
        toBinary(16);
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
