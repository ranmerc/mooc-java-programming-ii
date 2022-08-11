
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                break;
            }

            numberList.add(number);
        }

        numberList.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));

    }
}
