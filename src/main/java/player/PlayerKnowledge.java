package player;

import cards.Card;
import cards.CardPossibilities;
import player.hand.OtherPlayerHand;
import player.hand.OwnHand;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerKnowledge {

    private OwnHand ownHand;
    private Map<PlayerId, OtherPlayerHand> otherPlayerHands;

    public PlayerKnowledge(int handSize, Map<PlayerId, List<Card>> otherPlayerCards) {
        this.ownHand = new OwnHand(handSize);
        otherPlayerHands = otherPlayerCards.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> new OtherPlayerHand(e.getValue())));
    }


    public PlayerKnowledge(OwnHand ownHand, Map<PlayerId, OtherPlayerHand> otherPlayerHands) {
        this.ownHand = ownHand;
        this.otherPlayerHands = otherPlayerHands;
    }
}
