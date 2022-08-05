import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("To add:");
                String taskToAdd = scanner.nextLine();

                todoList.add(taskToAdd);
            }

            if (command.equals("list")) {
                todoList.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(scanner.nextLine());

                todoList.remove(toRemove);
            }
        }
    }
}
