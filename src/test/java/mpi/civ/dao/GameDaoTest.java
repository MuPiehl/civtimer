package mpi.civ.dao;

import de.mpi.civ.Nation;
import de.mpi.civ.Region;
import de.mpi.civ.dao.GameDao;
import de.mpi.civ.data.GameDto;
import de.mpi.civ.game.Player;
import org.joda.time.LocalDateTime;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthiaspiehl on 31.12.16.
 */
public class GameDaoTest {
    @Test
    public void testStoreGame(){
        GameDao gameDao =  GameDao.getInstace();

        GameDto gameDto= new GameDto();

        gameDto.setGameNumber(7);
        gameDto.setCreationDate(LocalDateTime.now());

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Hummel",    new Nation(7, Region.WEST, "Carthage")));
        playerList.add(new Player("Bummel",    new Nation(3, Region.WEST, "Assyria")));

        gameDto.setPlayer(playerList);

        /*
             result.add(new Nation(3, Region.WEST, "Assyria"));
        result.add(new Nation(4, Region.EAST, "Maurya"));
        result.add(new Nation(5, Region.WEST, "Celt"));
        result.add(new Nation(6, Region.EAST, "Babylon"));

        result.add(new Nation(8, Region.EAST, "Dravidia"));
        result.add(new Nation(9, Region.WEST, "Hatti"));
         */


        gameDao.save(gameDto);
    }
}
