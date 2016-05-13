package de.mpi.civ.game.engine;

/**
 * Created by Matthias.Piehl on 13.05.2016.
 */
public enum GameStatus {
    NEW_NOT_INITIALIZED("new_not_initialized"),
    PLAYER_NAMES_TO_ENTER("player_names_to_enter"),
    TURN_READY_TO_START("turn_ready_to_start"),
    ADJUST_CENSUS("adjust_census"),
    MOVEMENT_RUNNING("movement_running"),
    //    GAME_ENDED("game_ended");
    GAME_ENDED("index");
    private String value;

    GameStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
