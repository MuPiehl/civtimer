package de.mpi.civ.data;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;

        log.debug("setRegion: " + region);
    }

    Integer numberOfPlayer;
    String region;
}
