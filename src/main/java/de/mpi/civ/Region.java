package de.mpi.civ;

/**
 * Created by matthiaspiehl on 03.01.16.
 */
public enum Region {
    WEST("w"), EAST("e");
    private String value;

    Region(String value) {
        value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static Region newRegion(String regionName) {
        switch (regionName) {
            case "w":
            case    "west":return WEST;
            case "e":
            case "east":  return EAST;
        }
        return null;
    }
}
