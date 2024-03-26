package Attendance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attendance {

    public String whoIsHere() {
        Scanner scanner = new Scanner(System.in);
        int numCallouts = Integer.parseInt(scanner.nextLine());
        List<String> absentees = new ArrayList<>();
        String input;

        for (int i = 0; i < numCallouts; i++) {
            input = scanner.nextLine().trim();
            if (input.equals("Present!") && !absentees.isEmpty()) {
                absentees.remove(absentees.size() - 1);
            } else if (!input.isEmpty()) {
                absentees.add(input);
            }
        }
        scanner.close();

        StringBuilder result = new StringBuilder();
        if (absentees.isEmpty()) {
            result.append("No Absences");
        } else {
            for (String name : absentees) {
                result.append(name).append("\n"); 
            }
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        System.out.println(attendance.whoIsHere());
    }
}
