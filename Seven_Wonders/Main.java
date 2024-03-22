package Seven_Wonders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String lowercaseInput = input.toLowerCase();

        int tablets = 0;
        int compasses = 0;
        int gears = 0;

        for (char letter : lowercaseInput.toCharArray()) {
            if (letter == 't') {
                tablets++;
            } else if (letter == 'c') {
                compasses++;
            } else if (letter == 'g') {
                gears++;
            }
        }

        int points = tablets * tablets + compasses * compasses + gears * gears;

        int setsOfThree = Math.min(Math.min(tablets, compasses), gears);
        
        scanner.close();

        System.out.println(points+= setsOfThree * 7);
    }
}