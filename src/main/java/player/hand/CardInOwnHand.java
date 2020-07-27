package player.hand;

import cards.Card;
import cards.CardColour;
import cards.CardNumber;
import cards.CardPossibilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CardInOwnHand extends CardInHand {

    public Map<CardColour, Integer> possibleCards;

    public CardInOwnHand() {
        possibleCards = initPossibleCards();
    }

    private Map<CardColour, Integer> initPossibleCards() {
        Map<CardColour, Integer> possibleCards = new HashMap<>();
        CardColour.getAllColours().forEach(colour -> {
            CardNumber.getAllCardNumbers().forEach(number ->
                    possibleCards.put(colour, number)
            );
        });
        return possibleCards;
    }

    public void removePossibilities(Map<CardColour, Integer> impossibleCards) {
        impossibleCards.forEach((colour, value) -> possibleCards.remove(colour, value));
    }

    @Override
    public String toString() {
        return "CardInOwnHand{" +
                "possibleCards=" + possibleCards +
                '}';
    }
}
