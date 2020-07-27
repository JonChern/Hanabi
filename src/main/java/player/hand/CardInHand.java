package player.hand;

import cards.CardColour;

import java.util.Optional;

public abstract class CardInHand {

    public CardColour hintedColour;
    public Integer hintedValue;

    public void hintColour(CardColour colour) {
        hintedColour = colour;
    }

    public void hintValue(int value) {
        hintedValue = value;
    }

    public Optional<CardColour> getHintedColour() {
        return Optional.ofNullable(hintedColour);
    }

    public Optional<Integer> getHintedValue() {
        return Optional.ofNullable(hintedValue);
    }
}
