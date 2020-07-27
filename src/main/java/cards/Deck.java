package cards;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {

    List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public List<Card> drawCards(int numberToDraw) {
        return cards.stream().limit(numberToDraw).collect(Collectors.toList());
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "cards.Deck{" +
                "cards=" + cards +
                '}';
    }
}
