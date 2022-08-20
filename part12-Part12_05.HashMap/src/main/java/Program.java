
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here

        HashMap<String, String> hashMap = new HashMap<>();

        while (true) {
            System.out.println("");
            System.out.println("1: Add To Map");
            System.out.println("2: Remove from Map");
            System.out.println("3: Print Value of Particular Key from Map");
            System.out.println("4: Print Map");
            System.out.println("x: Exit");
            System.out.println("Choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Enter Key:");
                String key = scanner.nextLine();

                System.out.println("Enter Value:");
                String value = scanner.nextLine();

                hashMap.add(key, value);
            } else if (choice.equals("2")) {
                System.out.println("Enter Key:");
                String key = scanner.nextLine();

                Pair<String, String> removed = hashMap.remove(key);

                if (removed == null) {
                    System.out.println("Mapping not found!");
                } else {
                    System.out.println(removed + " removed from the map.");
                }
            } else if (choice.equals("3")) {
                System.out.println("Enter Key:");
                String key = scanner.nextLine();

                String pair = hashMap.get(key);

                if (pair == null) {
                    System.out.println("Mapping not found!");
                } else {
                    System.out.println(pair);
                }
            } else if (choice.equals("4")) {
                System.out.println("Hashmap has " + hashMap.size() + " mappings-");
                System.out.println(hashMap);
            } else if (choice.equals("x")) {
                break;
            } else {
                System.out.println("Invalid choice");
                continue;
            }

        }
    }

}
