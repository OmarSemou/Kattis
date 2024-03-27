package Greetings;

import java.util.Scanner;

public class Greetings {
    public String doubleE() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : input.toCharArray()) {
            stringBuilder.append(letter);
            if (letter == 'e') {
                stringBuilder.append("e");
            }
        }

       String modifiedString = stringBuilder.toString();

        scanner.close();

        return modifiedString;
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.doubleE());
    }
}
