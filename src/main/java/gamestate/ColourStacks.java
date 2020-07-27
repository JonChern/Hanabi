package gamestate;

import cards.Card;
import cards.CardColour;

import java.util.Map;
import java.util.stream.Collectors;

public class ColourStacks {

    public Map<CardColour, ColourStack> colourStacks;

    public static ColourStacks init() {
        Map<CardColour, ColourStack> colourStacks = CardColour.getAllColours().stream().collect(Collectors.toMap(c -> c, c -> ColourStack.createStack()));
        return new ColourStacks(colourStacks);
    }


    private ColourStacks(Map<CardColour, ColourStack> colourStacks) {
        this.colourStacks = colourStacks;
    }


    public boolean canCardBePlayed(Card card) {
        return colourStacks.get(card.getColour()).canNumberBePlayed(card.getNumber());
    }

    public void playCard(Card card) {
        colourStacks.get(card.getColour()).playCardOnStack();
    }


    public int getScore() {
        return colourStacks.values()
                .stream()
                .map(ColourStack::getStackCount)
                .reduce(0, Integer::sum);
    }
}
