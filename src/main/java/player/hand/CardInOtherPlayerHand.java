package player.hand;

import cards.Card;
import cards.CardColour;

import java.util.Optional;

public class CardInOtherPlayerHand extends CardInHand {

    private Card card;

    public CardInOtherPlayerHand(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
