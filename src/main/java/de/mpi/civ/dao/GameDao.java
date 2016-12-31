package de.mpi.civ.dao;

import de.mpi.civ.data.GameDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by matthiaspiehl on 31.12.16.
 */
public class GameDao {
    final static Logger log = LoggerFactory.getLogger(GameDao.class);

    private static GameDao theInstance;

    private GameDao(){}

    public static GameDao getInstace() {
        if (theInstance == null)
            theInstance = new GameDao();

        return theInstance;
    }

    public void save(GameDto gameDto) {
        //todo wirklich speichern
        log.debug("Muss dto speichern: " +gameDto);

    }
}
