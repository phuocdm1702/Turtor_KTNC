package com.example.turtor_ktnc_buoi1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    public void testFindMax() {
        int exp = 10;
        int acp = arrayUtils.findMax(new int[]{2, 4, 6, 7, 8, -1, 10});
        Assertions.assertEquals(exp, acp);
    }

    @Test
    public void testFindMaxEx() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayUtils.findMax(new int[]{}));
    }

    @Test
    public void testFindMaxEx2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> arrayUtils.findMax(null));
    }

}