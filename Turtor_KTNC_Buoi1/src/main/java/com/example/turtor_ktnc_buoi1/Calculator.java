package com.example.turtor_ktnc_buoi1;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public double divide(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return a/b;
    }
}
