import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> pipe;

    public Pipe() {
        pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        return pipe.remove(0);
    }

    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        }

        return true;
    }
}
