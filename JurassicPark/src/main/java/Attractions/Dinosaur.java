package Attractions;

import ServicesAndInfo.DinoDiet;
import ServicesAndInfo.TheatLevel;

public class Dinosaur {

    private String name;
    private DinoDiet diet;
    private TheatLevel theatLevel;

    public Dinosaur(String name,DinoDiet diet, TheatLevel theatLevel){
        this.name = name;
        this.diet = diet;
        this.theatLevel = theatLevel;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public DinoDiet getDiet() { return diet; }

    public TheatLevel getTheatLevel() {
        return theatLevel;
    }

    public void setTheatLevel(TheatLevel theatLevel) {
        this.theatLevel = theatLevel;
    }
}
