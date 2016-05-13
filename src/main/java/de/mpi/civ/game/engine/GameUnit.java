package de.mpi.civ.game.engine;

/**
 * Created by Matthias.Piehl on 13.05.2016.
 */
public class GameUnit {
    private static CivGame currentGame;

    public static CivGame getCurrentGame() {
        if (currentGame == null)
            currentGame = new CivGame();

        return currentGame;
    }
}
