
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<LiteracyStatistic> stats = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .forEach(line -> {
                        String[] fields = line.split(",");
                        String countryName = fields[3];
                        String gender = fields[2].trim().split(" ")[0];
                        int year = Integer.valueOf(fields[4]);
                        double percent = Double.valueOf(fields[5]);
                        stats.add(new LiteracyStatistic(countryName, gender, year, percent));
                        // in case map was used instead of forEach
                        // return new LiteracyStatistic(countryName, gender, year, percent);
                    })
            // in case map was used instead of forEach
            // .sorted()
            // .forEach(System.out::println);
            ;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        stats.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
