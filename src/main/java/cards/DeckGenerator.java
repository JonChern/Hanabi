package cards;

import java.util.ArrayList;
import java.util.List;

public class DeckGenerator {


    public static Deck generateRandomOrderDeck() {
        Deck deck = generateOrderedDeck();
        deck.shuffle();
        return deck;
    }


    public static Deck generateOrderedDeck() {
        List<Card> deck = new ArrayList<Card>();
        for (CardColour colour : CardColour.getAllColours()) {
            deck.addAll(makeMultiples(colour, CardNumber.ONE));
            deck.addAll(makeMultiples(colour, CardNumber.TWO));
            deck.addAll(makeMultiples(colour, CardNumber.THREE));
            deck.addAll(makeMultiples(colour, CardNumber.FOUR));
            deck.addAll(makeMultiples(colour, CardNumber.FIVE));
        }
        return new Deck(deck);
    }

    private static List<Card> makeMultiples(CardColour colour, CardNumber number) {
        List<Card> sameCards = new ArrayList<>();
        for (int i = 0; i < number.numberOfCardsWithTheSameValue; i++) {
            sameCards.add(new Card(number.cardValue, colour));
        }
        return sameCards;
    }


}
