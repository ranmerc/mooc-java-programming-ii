import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> organisms;

    public Herd() {
        organisms = new ArrayList<>();
    }

    @Override
    public String toString() {
        String toPrint = "";

        for (Movable organism : organisms) {
            toPrint += organism.toString() + "\n";
        }

        return toPrint;
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism : organisms) {
            organism.move(dx, dy);
        }
    }
}
