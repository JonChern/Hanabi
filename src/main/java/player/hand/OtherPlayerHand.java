package player.hand;

import cards.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OtherPlayerHand {

    List<CardInOtherPlayerHand> cardsInOtherPlayerHands;

    public OtherPlayerHand(List<Card> cards) {
        cardsInOtherPlayerHands = cards.stream().map(CardInOtherPlayerHand::new).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "OtherPlayerHand{" +
                "cardsInOtherPlayerHands=" + cardsInOtherPlayerHands +
                '}';
    }
}
