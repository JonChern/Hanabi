package cards;

import java.util.Objects;

public class Card {

    int number;
    CardColour colour;


    public Card(int number, CardColour colour) {
        this.number = number;
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public CardColour getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number &&
                colour == card.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, colour);
    }

    @Override
    public String toString() {
        return "cards.Card{" +
                "number=" + number +
                ", colour=" + colour +
                '}';
    }
}
