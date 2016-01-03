package de.mpi.civ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthiaspiehl on 03.01.16.
 */
public class GlobalNationList {
    public static List<Nation> getAll() {

        List<Nation> result = new ArrayList<Nation>();
        result.add(new Nation(1, Region.WEST, "Minoa"));
        result.add(new Nation(2, Region.EAST, "Saba"));
        return result;
    }
}
