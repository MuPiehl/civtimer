package de.mpi.civ.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import de.mpi.civ.game.Player;
import org.joda.time.LocalDateTime;

import java.util.List;


/**
 * Created by matthiaspiehl on 31.12.16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDto {
    private Integer gameNumber;
    private LocalDateTime creationDate;
    private List<Player> player;

    public Integer getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(Integer gameNumber) {
        this.gameNumber = gameNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }
}
