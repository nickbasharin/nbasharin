package ru.job4j.calculator;

/**
 *Класс с методами элементарных вычислений
 */
public class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiplie(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }

}
