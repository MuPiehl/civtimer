package de.mpi.civ.game.engine;

import de.mpi.civ.Region;
import de.mpi.civ.data.InitData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthias.Piehl on 13.05.2016.
 */
public class CivGame {
    private GameStatus status;
    private Integer numberOfPlayer;
    private List<Region> boardRegions = new ArrayList<Region>();

    // nur über GameUnit erstellbar
    protected CivGame() {
        status = GameStatus.NEW_NOT_INITIALIZED;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void init(InitData initData) {
        this.numberOfPlayer = initData.getNumberOfPlayer();

        if (numberOfPlayer > 11) {
            boardRegions.add(Region.WEST);
            boardRegions.add(Region.EAST);
        } else {
            boardRegions.add(initData.getRegion());
        }
        status = GameStatus.PLAYER_NAMES_TO_ENTER;
    }
}
