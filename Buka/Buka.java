package Buka;

import java.math.BigInteger;
import java.util.Scanner;

public class Buka {
    // Using BigInteger since int is too small for 100 digits 
    Scanner scanner;
    BigInteger a;
    String operation;
    BigInteger b;

    public BigInteger calculate() {
        scanner = new Scanner(System.in);
        a = new BigInteger(scanner.nextLine());
        operation = scanner.nextLine();
        b = new BigInteger(scanner.nextLine());

        scanner.close();

        if (operation.equals("*")) {
            return a.multiply(b);
        } else if (operation.equals("+")) {
            return a.add(b);
        }
        // Only when operations is neither + or *
        return BigInteger.ZERO;
    }

    public static void main(String[] args) {
        Buka buka = new Buka();
        System.out.println(buka.calculate());
    }    
}