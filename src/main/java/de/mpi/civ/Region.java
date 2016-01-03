package de.mpi.civ;

/**
 * Created by matthiaspiehl on 03.01.16.
 */
public enum Region {
    WEST("w"), EAST("e");
    private String value;

    Region(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
