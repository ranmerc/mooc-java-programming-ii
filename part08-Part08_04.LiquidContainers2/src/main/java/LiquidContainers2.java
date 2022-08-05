
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] fields = input.split(" ");
            String command = fields[0];
            int amount = Integer.valueOf(fields[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                if (amount >= firstContainer.contains()) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                } else {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}
