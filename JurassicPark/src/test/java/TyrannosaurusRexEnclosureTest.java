import Attractions.Dinosaur;
import Park.TyrannosaurusRexEnclosure;
import ServicesAndInfo.DinoDiet;
import ServicesAndInfo.TheatLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyrannosaurusRexEnclosureTest {

    TyrannosaurusRexEnclosure tyrannosaurusRexEnclosure;
    Dinosaur dinosaur;

    @Before
    public void setup(){

        dinosaur = new Dinosaur("Tyrannosaurus Rex", DinoDiet.CARNIVORE, TheatLevel.DEADLY);
        tyrannosaurusRexEnclosure = new TyrannosaurusRexEnclosure("Enclosure 20",dinosaur,16);

    }

    @Test
    public void canShock() {
        assertEquals("Tyrannosaurus Rex attacked wall but was Shocked", tyrannosaurusRexEnclosure.Shock(dinosaur));
    }

    @Test
    public void canAbsorbImpact() {
        assertEquals("Tyrannosaurus Rex attacked wall but was Stunned", tyrannosaurusRexEnclosure.absorbImpact(dinosaur));
    }

    @Test
    public void hasName() {
        assertEquals("Enclosure 20",tyrannosaurusRexEnclosure.getName());
    }

    @Test
    public void canSetName() {
        tyrannosaurusRexEnclosure.setName("Enclosure 11");
        assertEquals("Enclosure 11",tyrannosaurusRexEnclosure.getName());
    }

    @Test
    public void hasDino() {
        assertEquals(dinosaur, tyrannosaurusRexEnclosure.getDinosaur());
    }

    @Test
    public void hasHP() {
        assertEquals(16,tyrannosaurusRexEnclosure.getEnclosureHP());
    }

    @Test
    public void canSetEnclosureHP() {
        tyrannosaurusRexEnclosure.setEnclosureHP(9);
        assertEquals(9,tyrannosaurusRexEnclosure.getEnclosureHP());
    }

    @Test
    public void enclosureCanTakeDamage() {
        tyrannosaurusRexEnclosure.absorbImpactAndShock(dinosaur);
        assertEquals(14,tyrannosaurusRexEnclosure.getEnclosureHP());
    }
}

