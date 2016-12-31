package de.mpi.civ.game;

import de.mpi.civ.Nation;

/**
 * Created by matthiaspiehl on 31.12.16.
 */
public class Player {
    private String name;
    private Nation nation;

    public Player(String name, Nation nation) {
        this.name = name;
        this.nation = nation;
    }
}
