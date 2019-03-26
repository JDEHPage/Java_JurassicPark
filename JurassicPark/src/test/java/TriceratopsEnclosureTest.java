import Attractions.*;
import Park.TriceratopsEnclosure;
import ServicesAndInfo.DinoDiet;
import ServicesAndInfo.TheatLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriceratopsEnclosureTest{

    TriceratopsEnclosure triceratopsEnclosure;
    Dinosaur dinosaur;

    @Before
    public void setup(){

        dinosaur = new Dinosaur("Triceratops", DinoDiet.HERBIVORE, TheatLevel.MEDIUM);
        triceratopsEnclosure = new TriceratopsEnclosure("Enclosure 13",dinosaur,10);
    }

    @Test
    public void canAbsorbImpact() {
        assertEquals("Triceratops attacked wall but was Stunned", triceratopsEnclosure.absorbImpact(dinosaur));
    }

    @Test
    public void hasName() {
        assertEquals("Enclosure 13",triceratopsEnclosure.getName());
    }

    @Test
    public void canSetName() {
        triceratopsEnclosure.setName("Enclosure 11");
        assertEquals("Enclosure 11",triceratopsEnclosure.getName());
    }

    @Test
    public void hasDino() {
        assertEquals(dinosaur, triceratopsEnclosure.getDinosaur());
    }

    @Test
    public void hasHP() {
        assertEquals(10,triceratopsEnclosure.getEnclosureHP());
    }

    @Test
    public void canSetEnclosureHP() {
        triceratopsEnclosure.setEnclosureHP(9);
        assertEquals(9,triceratopsEnclosure.getEnclosureHP());
    }

    @Test
    public void enclosureCanTakeDamage() {
        triceratopsEnclosure.absorbImpact(dinosaur);
        assertEquals(9,triceratopsEnclosure.getEnclosureHP());
    }
}
