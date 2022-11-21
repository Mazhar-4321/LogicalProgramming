package com.company;

public class Binary {
    private static final int BINARY = 2;
    private static final char CHAR_ZERO = '0';
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int HALF_BIT = 4;
    private static String binaryRepresentation = "";
    private static String swappedString = "";
    private int decimalNumber;

    Binary(int decimalNumber) {
        this.decimalNumber = decimalNumber;
        toBinary();
        swapNibbles();
        toDecimal(swappedString);
    }

    private void toBinary() {
        while (decimalNumber > ZERO) {
            binaryRepresentation = (decimalNumber % BINARY) + binaryRepresentation;
            decimalNumber = decimalNumber / BINARY;
        }
    }

    private void swapNibbles() {
        if (binaryRepresentation.length() < 8) {
            binaryRepresentation = ZERO + binaryRepresentation;
        }
        String nibble1 = binaryRepresentation.substring(ZERO, HALF_BIT);
        String nibble2 = binaryRepresentation.substring(HALF_BIT);
        swappedString = nibble2 + nibble1;
        System.out.println(swappedString);
    }

    private void toDecimal(String binaryRepresentation) {
        int decimalRepresentation = ZERO;
        for (int i = binaryRepresentation.length() - 1, k = ZERO; i >= ZERO; i--, k++) {
            if (binaryRepresentation.charAt(i) == CHAR_ZERO) {
                decimalRepresentation = decimalRepresentation + (int) (Math.pow(2, k) * ZERO);
                continue;
            }
            decimalRepresentation = decimalRepresentation + (int) (Math.pow(2, k) * ONE);
        }
        System.out.println(decimalRepresentation);
    }
}
