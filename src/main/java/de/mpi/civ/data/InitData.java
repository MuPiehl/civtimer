package de.mpi.civ.data;

import de.mpi.civ.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Matthias.Piehl on 13.05.2016.
 */
public class InitData {
    private static Logger log = LoggerFactory.getLogger(InitData.class);

    public Integer getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(Integer numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;

        log.debug("setNumberOfPlayer: " + numberOfPlayer);
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(String regionName) {
        this.region = Region.newRegion(regionName);

        log.debug("setRegion: " + region);
    }

    Integer numberOfPlayer;
    Region region;
}
