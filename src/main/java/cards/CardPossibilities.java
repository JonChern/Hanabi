package cards;

import java.util.HashMap;
import java.util.Map;

public class CardPossibilities {

    Map<CardColour, Integer> possibleCards;

    public static CardPossibilities init() {
        Map<CardColour, Integer> possibleCards = new HashMap<>();
        CardColour.getAllColours().forEach(colour -> {
            CardNumber.getAllCardNumbers().forEach(number ->
                    possibleCards.put(colour, number)
            );
        });
        return new CardPossibilities(possibleCards);
    }

    public CardPossibilities(Map<CardColour, Integer> possibleCards) {
        this.possibleCards = possibleCards;
    }
}
