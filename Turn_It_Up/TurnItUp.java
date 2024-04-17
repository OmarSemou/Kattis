package Turn_It_Up;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TurnItUp {
    public int volumeControl() {
        Scanner scanner = new Scanner(System.in);
        int volumeAdjustmentsNum = scanner.nextInt();
        int currentVolume = 7;
        List<String> volumeAdjustments = new ArrayList<>();

        for (int i = 0; i <= volumeAdjustmentsNum; i++) {
            volumeAdjustments.add(scanner.nextLine().trim());
        }

        for (String volumeChange : volumeAdjustments) {
            if (currentVolume < 10 && volumeChange.equals("Skru op!")) {
                currentVolume++;
            } else if (currentVolume > 0 && volumeChange.equals("Skru ned!")) {
                currentVolume--;
            }
        }

        scanner.close();

        return currentVolume;
    }

    public static void main(String[] args) {
        TurnItUp turnItUp = new TurnItUp();
        System.out.println(turnItUp.volumeControl());
    }
}
