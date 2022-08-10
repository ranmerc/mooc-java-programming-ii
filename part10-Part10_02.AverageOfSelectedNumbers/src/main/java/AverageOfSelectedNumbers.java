
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: " + average);
        } else {
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
