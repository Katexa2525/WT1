package org.example.task9;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball(0.5, "red");
        Ball ball2 = new Ball(0.3, "blue");
        Ball ball3 = new Ball(0.8, "blue");

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);

        double totalWeight = basket.getTotalWeight();
        int blueBalls = basket.countBlueBalls();

        System.out.println("Total weight of balls in the basket: " + totalWeight);
        System.out.println("Number of blue balls in the basket: " + blueBalls);
    }
}
