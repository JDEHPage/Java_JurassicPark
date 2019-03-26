package Park;

import Attractions.*;

public class TyrannosaurusRexEnclosure extends Attraction implements iElectricFencing, iReinforcedWalls{

    public TyrannosaurusRexEnclosure(String name, Dinosaur dinosaur, int enclosureHP){
        super(name,dinosaur, enclosureHP);
    }

    public String Shock(Dinosaur dinosaur){
        this.reduceEnclosureHP();
        return String.format("%s attacked wall but was Shocked", dinosaur.getName());
    }

    public String absorbImpact(Dinosaur dinosaur){
        this.reduceEnclosureHP();
        return String.format("%s attacked wall but was Stunned", dinosaur.getName());
    }

    public void absorbImpactAndShock(Dinosaur dinosaur){
        this.Shock(dinosaur);
        this.absorbImpact(dinosaur);
    }

}
