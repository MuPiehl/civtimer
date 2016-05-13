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
        result.add(new Nation(3, Region.WEST, "Assyria"));
        result.add(new Nation(4, Region.EAST, "Maurya"));
        result.add(new Nation(5, Region.WEST, "Celt"));
        result.add(new Nation(6, Region.EAST, "Babylon"));
        result.add(new Nation(7, Region.WEST, "Carthage"));
        result.add(new Nation(8, Region.EAST, "Dravidia"));
        result.add(new Nation(9, Region.WEST, "Hatti"));
        result.add(new Nation(10, Region.EAST, "Kushan"));
        result.add(new Nation(11, Region.WEST, "Rome"));
        result.add(new Nation(12, Region.EAST, "Persia"));
        result.add(new Nation(13, Region.WEST, "Iberia"));
        result.add(new Nation(14, Region.EAST, "Nubia"));
        result.add(new Nation(15, Region.WEST, "Hellas"));
        result.add(new Nation(16, Region.EAST, "Indus"));
        result.add(new Nation(17, Region.WEST, "Egypt"));
        result.add(new Nation(18, Region.EAST, "Parthia"));

        return result;
    }
}
