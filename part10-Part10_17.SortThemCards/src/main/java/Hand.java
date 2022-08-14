import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream()
                .forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int value() {
        return cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (value, sum) -> value + sum);
    }

    @Override
    public int compareTo(Hand comparedHand) {
        return this.value() - comparedHand.value();
    }

    public void sortBySuit() {
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Collections.sort(cards, comparator);
    }
}
