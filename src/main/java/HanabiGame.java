import com.google.common.collect.ImmutableList;
import player.PlayerId;

import java.util.List;

public class HanabiGame {


    private static int PLAYER_COUNT = 3;

    public static void main(String[] args) {

        List<PlayerId> players = ImmutableList.of(PlayerId.of("Alice"), PlayerId.of("Bob"), PlayerId.of("Charlie"));

        GameState gameState = new GameState(players);


        for (int i = 0; i < PLAYER_COUNT; i++) {


        }


    }

}
