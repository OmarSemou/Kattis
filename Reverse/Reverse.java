package Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public StringBuilder reverse() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        Collections.reverse(numbers);

        StringBuilder stringBuilder = new StringBuilder();

        for (Integer reversedInteger : numbers) {
            stringBuilder.append(reversedInteger);
            stringBuilder.append("\n");
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse());
    }    
}