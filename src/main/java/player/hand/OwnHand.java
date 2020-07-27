package player.hand;

import cards.CardColour;

import java.util.ArrayList;
import java.util.List;

public class OwnHand {

    List<CardInOwnHand> cardsInHand;

    public OwnHand(int handSize) {
        cardsInHand = new ArrayList<>();
        for (int i = 0; i < handSize; i++) {
            cardsInHand.add(new CardInOwnHand());
        }
    }


    public void receiveHintForColour(CardColour colour){

    }

    public void receiveHintForValue(int value){

    }
}
