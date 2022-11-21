package com.company;

public class Main {
    static final int ZERO = 0;
    static final int BINARY = 2;

    public static void main(String[] args) {
        System.out.println("Logical Programming");
        toBinary(100);
        Binary binary= new Binary(100);

    }

    public static void toBinary(int decimalNumber) {
        String binaryRepresentation = "";
        while (decimalNumber > ZERO) {
            binaryRepresentation = (decimalNumber % BINARY) + binaryRepresentation;
            decimalNumber = decimalNumber / BINARY;
        }
        System.out.println(binaryRepresentation);
    }
    public static void findSqrt(int c){
        if(c>0){
            System.out.println("Invalid Input");
            return;
        }
        int t=c;
        double ans=0;//9
//       while(Math.abs(t-c/t)>) {
//           t = t + c / t;
//       }
    }
}
