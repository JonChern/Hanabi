package cards;

import com.google.common.collect.ImmutableList;

import java.util.List;

public enum CardColour {

    RED,
    BLUE,
    GREEN,
    YELLOW,
    WHITE;

    public static List<CardColour> getAllColours() {
        return ImmutableList.of(RED, BLUE, GREEN, YELLOW, WHITE);
    }

}
