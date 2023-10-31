package org.example.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(2, 10.5));
    }
    public static double calculate(double x, double y) {
        return (1 + Math.sin(x + y) * Math.sin(x + y)) /
                (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }
}
