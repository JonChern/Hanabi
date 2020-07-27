import cards.Deck;
import cards.DeckGenerator;
import org.junit.jupiter.api.Test;

public class GenerateDeckTest {


    @Test
    public void generateOrderedDeck() {
        Deck deck = DeckGenerator.generateOrderedDeck();
        System.out.println(deck.toString());
    }

    @Test
    public void generateRandomOrderDeck() {
        Deck deck1 = DeckGenerator.generateRandomOrderDeck();
        Deck deck2 = DeckGenerator.generateRandomOrderDeck();
        System.out.println(deck1.toString());
        System.out.println(deck2.toString());
    }
}
