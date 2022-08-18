public class List<T> {

    private T[] values;
    private int firstFreeIndex;

    public List() {
        // Type casting Object[] to T[]
        values = (T[]) new Object[10];
        firstFreeIndex = 0;
    }

    public void add(T value) {
        if (firstFreeIndex == values.length) {
            grow();
        }

        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }

    public void grow() {
        int newSize = values.length + (values.length / 2);

        T[] newValues = (T[]) new Object[newSize];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }

        values = newValues;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex; i++) {
            values[i] = values[i + 1];
        }
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);

        if (indexOfValue == -1) {
            return;
        }

        moveToTheLeft(indexOfValue);
        firstFreeIndex--;
    }

    public T value(int index) {
        if (index < 0 || index > firstFreeIndex) {
            return null;
        }

        return this.values[index];
    }

    public int size() {
        return firstFreeIndex;
    }

    @Override
    public String toString() {
        String toPrint = "[";

        for (int i = 0; i < firstFreeIndex; i++) {
            toPrint += values[i] + ",";
        }

        return toPrint + "]";
    }
}
