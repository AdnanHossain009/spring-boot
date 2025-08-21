package org.springframework.boot.build;

public class Calculator {

public double add(double a, double b) {
    double result = a + b;
    return Math.round(result * 100.0) / 100.0; // keep rounding and addition
}


    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
