package de.mpi.civ;

/**
 * Created by matthiaspiehl on 03.01.16.
 */
public class Nation {
    private final int id;
    private final Region region;
    private final String title;

    public Nation(int id, Region region, String title) {
        this.id = id;
        this.region = region;
        this.title = title;
    }


    public String getImageUrl() {
        return region + "_" + id + "_" + title.toLowerCase() + ".png";
    }

    public int getId(){ return id;}
    public String getTitle(){ return title;}
}
