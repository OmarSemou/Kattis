package Buka;

import java.util.Scanner;

public class Buka {
    Scanner scanner;
    int a;
    String operation;
    int b;

    public int calculate() {
        scanner = new Scanner(System.in);
        a = scanner.nextInt();

        // Swallow extra line when pressing enter
        scanner.nextLine();
        
        operation = scanner.nextLine();
        b = scanner.nextInt();

        if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("+")) {
            return a + b;
        }
        // Only when operations is neither + or *
        return 0;
    }

    public static void main(String[] args) {
        Buka buka = new Buka();
        System.out.println(buka.calculate());
    }    
}