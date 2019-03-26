package Park;

import Attractions.Attraction;
import Attractions.Dinosaur;
import Attractions.iReinforcedWalls;

public class TriceratopsEnclosure extends Attraction implements iReinforcedWalls {

    public TriceratopsEnclosure(String name, Dinosaur dinosaur, int enclosureHP){
        super(name,dinosaur, enclosureHP);
    }

    public String absorbImpact(Dinosaur dinosaur){
        this.reduceEnclosureHP();
        return String.format("%s attacked wall but was Stunned", dinosaur.getName());
    }
}
