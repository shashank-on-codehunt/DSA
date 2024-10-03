package com.scubeangle;

public class BitwiseManipulation {
    public String convertDecimalToBinary(int input) {
        String binaryResult = "";
        while(input != 0) {
            if (input % 2 == 0) {
                binaryResult = binaryResult + "0";
            } else {
                binaryResult = binaryResult + "1";
            }
            input = input/2;
        }
        return new StringBuilder(binaryResult).reverse().toString();
    }
}
