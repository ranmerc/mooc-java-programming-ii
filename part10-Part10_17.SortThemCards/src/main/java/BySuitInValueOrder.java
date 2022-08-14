import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        if (card2.getSuit().ordinal() < card1.getSuit().ordinal()) {
            return 1;
        } else if (card2.getSuit().ordinal() > card1.getSuit().ordinal()) {
            return -1;
        } else {
            if (card2.getValue() < card1.getValue()) {
                return 1;
            } else if (card2.getValue() > card1.getValue()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
