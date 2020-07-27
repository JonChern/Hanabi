package cards;

import com.google.common.collect.ImmutableList;

import java.util.List;

public enum CardNumber {

    ONE(1, 3),
    TWO(2, 2),
    THREE(3, 2),
    FOUR(4, 2),
    FIVE(5, 1);

    int cardValue;
    int numberOfCardsWithTheSameValue;

    CardNumber(int cardValue, int numberOfCardsWithTheSameValue) {
        this.cardValue = cardValue;
        this.numberOfCardsWithTheSameValue = numberOfCardsWithTheSameValue;
    }

    public int getNumberOfCardsWithTheSameValue(int cardValue) {
        if (cardValue == ONE.cardValue) {
            return ONE.numberOfCardsWithTheSameValue;
        }
        if (cardValue == TWO.cardValue) {
            return TWO.numberOfCardsWithTheSameValue;
        }
        if (cardValue == THREE.cardValue) {
            return THREE.numberOfCardsWithTheSameValue;
        }
        if (cardValue == FOUR.cardValue) {
            return FOUR.numberOfCardsWithTheSameValue;
        }
        if (cardValue == FIVE.cardValue) {
            return FIVE.numberOfCardsWithTheSameValue;
        }
        return 0;
    }

    public static List<Integer> getAllCardNumbers() {
        return ImmutableList.of(ONE.cardValue, TWO.cardValue, THREE.cardValue, FOUR.cardValue, FIVE.cardValue);
    }
}
