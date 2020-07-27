import cards.*;
import gamestate.ColourStacks;
import player.PlayerId;
import player.PlayerKnowledge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameState {

    private Deck deck;
    private ColourStacks colourStacks;
    private DiscardPile discardPile;
    private int hintCounter;
    private int misfireCounter;
    private Map<PlayerId, PlayerKnowledge> playerKnowledge;


    public GameState(List<PlayerId> playerIds) {
        this.deck = DeckGenerator.generateRandomOrderDeck();
        this.colourStacks = ColourStacks.init();
        this.discardPile = new DiscardPile();
        this.hintCounter = 8;
        this.misfireCounter = 0;
        this.playerKnowledge = new HashMap<>();
        initPlayerKnowledge(playerIds);
    }

    private void initPlayerKnowledge(List<PlayerId> playerIds) {
        int handSize = getHandSize(playerIds.size());

        Map<PlayerId, List<Card>> cardsForEachPlayer = new HashMap<>();
        for (PlayerId player : playerIds) {
            cardsForEachPlayer.put(player, deck.drawCards(handSize));
        }

        for (PlayerId player : playerIds) {
            PlayerKnowledge singlePlayerKnowledge = new PlayerKnowledge(handSize, removeWithoutModification(cardsForEachPlayer, player));
            playerKnowledge.put(player, singlePlayerKnowledge);
        }

    }

    private <K, V> Map<K, V> removeWithoutModification(Map<K, V> map, K toRemove) {
        Map<K, V> newMap = new HashMap<>(map);
        newMap.remove(toRemove);
        return newMap;
    }

    public void createHint(PlayerId playerGivingHint, PlayerId playerReceivingHint, int cardValue ){

    }

    public void createHint(PlayerId playerGivingHint, PlayerId playerReceivingHint, CardColour cardColour ){

    }


    public void attemptToPlayCard(Card card) {
        if (colourStacks.canCardBePlayed(card)) {
            colourStacks.playCard(card);
        } else {
            misfireCounter++;
        }
    }

    private int getHandSize(int playerCount) {
        if (playerCount == 2 || playerCount == 3) {
            return 5;
        } else return 4;
    }


}
