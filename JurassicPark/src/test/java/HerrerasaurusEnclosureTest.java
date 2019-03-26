import Attractions.*;
import Park.HerrerasaurusEnclosure;
import ServicesAndInfo.DinoDiet;
import ServicesAndInfo.TheatLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerrerasaurusEnclosureTest {

    HerrerasaurusEnclosure herrerasaurusEnclosure;
    Dinosaur dinosaur;

    @Before
    public void setup(){

        dinosaur = new Dinosaur("Herrerasaurus", DinoDiet.CARNIVORE, TheatLevel.HIGHT);
        herrerasaurusEnclosure = new HerrerasaurusEnclosure("Enclosure 10",dinosaur,10);

    }

    @Test
    public void canShock() {
        assertEquals("Herrerasaurus attacked wall but was Shocked", herrerasaurusEnclosure.Shock(dinosaur));
    }

    @Test
    public void hasName() {
        assertEquals("Enclosure 10",herrerasaurusEnclosure.getName());
    }

    @Test
    public void canSetName() {
        herrerasaurusEnclosure.setName("Enclosure 11");
        assertEquals("Enclosure 11",herrerasaurusEnclosure.getName());
    }

    @Test
    public void hasDino() {
        assertEquals(dinosaur, herrerasaurusEnclosure.getDinosaur());
    }

    @Test
    public void hasHP() {
        assertEquals(10,herrerasaurusEnclosure.getEnclosureHP());
    }

    @Test
    public void canSetEnclosureHP() {
        herrerasaurusEnclosure.setEnclosureHP(9);
        assertEquals(9,herrerasaurusEnclosure.getEnclosureHP());
    }

    @Test
    public void enclosureCanTakeDamage() {
        herrerasaurusEnclosure.Shock(dinosaur);
        assertEquals(9,herrerasaurusEnclosure.getEnclosureHP());
    }
}
