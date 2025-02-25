package com.example.turtor_ktnc_buoi1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //Tạo đối tượng
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        //Kết quả mong muốn
        int exp = 7;
        //Kết quả thực tế
        int act = calc.add(4, 3);
        //So sánh kết quả mong muốn có khớp với kết quả thực tế không?
        Assertions.assertEquals(exp, act);
    }


    @Test
    public void testDivide() {
        double exp = 1.5;

        double act = calc.divide(3, 2);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(
                ArithmeticException.class, () -> calc.divide(3, 0)
        );
    }
}