
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                toReturn.append(array[i][j]);
            }

            toReturn.append("\n");
        }

        return toReturn.toString();
    }
}
