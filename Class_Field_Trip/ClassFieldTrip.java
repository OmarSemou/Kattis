package Class_Field_Trip;

import java.util.Arrays;
import java.util.Scanner;

public class ClassFieldTrip {
    public String mergeStrings() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();

        String combinedString = a + b;

        char[] charArray = combinedString.toCharArray();

        Arrays.sort(charArray);

        String sortedString = new String(charArray);

        scanner.close();

        return sortedString;
    }

    public static void main(String[] args) {
        ClassFieldTrip classFieldTrip = new ClassFieldTrip();
        System.out.println(classFieldTrip.mergeStrings());
    }
}
