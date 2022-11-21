package com.company;

public class Binary {
    private static final int BINARY = 2;
    private static final char CHAR_ZERO='0';
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int FORWARD = 0;
    private static final int REVERSE = 1;
    private static final int OCTET = 8;
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
        String reverse = "";
        for (int i = binaryRepresentation.length() - 1; i >= ZERO; i--) {
            reverse += binaryRepresentation.charAt(i);
        }
        swappedString = binaryRepresentation + binaryRepresentation;
        int direction = REVERSE;
        while (swappedString.length() < 8) {
            if (direction == REVERSE) {
                swappedString = reverse + swappedString;
                continue;
            }
            swappedString = binaryRepresentation + swappedString;

        }
        int overflow = swappedString.length() - OCTET;
        swappedString = swappedString.substring(overflow);
        System.out.println(swappedString);
        String nibble1 = swappedString.substring(ZERO, HALF_BIT);
        String nibble2 = swappedString.substring(HALF_BIT);
        swappedString = nibble2 + nibble1;
        System.out.println(swappedString);
    }

    private void toDecimal(String binaryRepresentation) {
        int decimalRepresentation = ZERO;
        for (int i = binaryRepresentation.length() - 1,k=ZERO; i >= ZERO; i--,k++) {
            if(binaryRepresentation.charAt(i)==CHAR_ZERO){
            decimalRepresentation= decimalRepresentation+(int)(Math.pow(2,k)*ZERO);
            continue;
            }
            decimalRepresentation= decimalRepresentation+(int)(Math.pow(2,k)*ONE);
        }
        System.out.println(decimalRepresentation);


    }
}
