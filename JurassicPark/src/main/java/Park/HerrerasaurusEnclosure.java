package Park;

import Attractions.*;

public class HerrerasaurusEnclosure extends Attraction implements iElectricFencing {

    public HerrerasaurusEnclosure(String name, Dinosaur dinosaur, int enclosureHP){
        super(name,dinosaur, enclosureHP);
    }

    public String Shock(Dinosaur dinosaur){
        this.reduceEnclosureHP();
        return String.format("%s attacked wall but was Shocked", dinosaur.getName());
    }


}
