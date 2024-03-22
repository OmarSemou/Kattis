package Seven_Wonders;

import java.util.Scanner;

public class SevenWonders {
    public int scoreCalculator() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String lowercaseInput = input.toLowerCase();

        int tCount = 0;
        int cCount = 0;
        int gCount = 0;

        for (char letter : lowercaseInput.toCharArray()) {
            if (letter == 't') {
                tCount++;
            } else if (letter == 'c') {
                cCount++;
            } else if (letter == 'g') {
                gCount++;
            }
        }

        int points = tCount * tCount + cCount * cCount + gCount * gCount;

        // Calculate the number of complete sets of three different cards ('T', 'C', 'G') a player has.
        // The number of complete sets is limited by the card type that has the least amount of cards.
        // Using Math.min to find the smallest count among the three types of cards.
        int setsOfThree = Math.min(Math.min(tCount, cCount), gCount);

        points += setsOfThree * 7;

        scanner.close();

        return points;
    }

    public static void main(String[] args) {
        SevenWonders game = new SevenWonders();
        System.out.println(game.scoreCalculator());
    }
}