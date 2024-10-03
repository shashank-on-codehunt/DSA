package com.scubeangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseManipulationTest {
    @Test
    void checkConvertDecimalToBinary() {
        BitwiseManipulation bitwiseManipulation = new BitwiseManipulation();
        assertEquals(bitwiseManipulation.convertDecimalToBinary(10), "1010");
    }

    @Test
    void checkConvertDecimalToBinaryWithDifferentArguments() {
        BitwiseManipulation bitwiseManipulation = new BitwiseManipulation();
        assertEquals(bitwiseManipulation.convertDecimalToBinary(13),"1101");
    }

}
