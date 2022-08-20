
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm
        // here
        int xIndex = 0;
        int yIndex = size / 2;
        int value = 1;

        while (value <= size * size) {
            square.placeValue(xIndex, yIndex, value++);

            int newXIndex = xIndex - 1;
            int newYIndex = yIndex + 1;

            if (newXIndex < 0) {
                newXIndex = size + newXIndex;
            }

            if (newYIndex >= size) {
                newYIndex = size - newYIndex;
            }

            if (square.readValue(newXIndex, newYIndex) != 0) {
                newXIndex = (xIndex + 1) % size;
                newYIndex = yIndex;
            }

            xIndex = newXIndex;
            yIndex = newYIndex;
        }

        return square;
    }

}
