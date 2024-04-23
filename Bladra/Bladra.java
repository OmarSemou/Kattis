package Bladra;

import java.util.Scanner;

public class Bladra {
    Scanner scanner;
    int velocity;
    int acceleration;
    int time;

    public double distanceCalculator() {
        scanner = new Scanner(System.in);
        velocity = scanner.nextInt();
        acceleration = scanner.nextInt();
        time = scanner.nextInt();

        return (double) velocity * time + 0.5 * acceleration * Math.pow(time, 2.0);
    }

    public static void main(String[] args) {
        Bladra bladra = new Bladra();
        System.out.println(bladra.distanceCalculator());
    }
}
