package de.mpi.civ.game.engine;

/**
 * Created by Matthias.Piehl on 13.05.2016.
 */
public class CivGame {
    private GameStatus status;

    // nur über GameUnit erstellbar
    protected CivGame() {
        status = GameStatus.NEW_NOT_INITIALIZED;
    }

    public GameStatus getStatus() {
        return status;
    }
}
