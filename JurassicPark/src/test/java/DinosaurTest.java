import ServicesAndInfo.DinoDiet;
import Attractions.Dinosaur;
import ServicesAndInfo.TheatLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    Dinosaur Herrerasaurus;
    Dinosaur Triceratops;

    @Before
    public void setup(){
        Herrerasaurus = new Dinosaur("Herrerasaurus", DinoDiet.CARNIVORE, TheatLevel.HIGHT);
        Triceratops = new Dinosaur("Triceratops", DinoDiet.HERBIVORE, TheatLevel.MEDIUM);
    }

    @Test
    public void hasName() {
        assertEquals("Herrerasaurus", Herrerasaurus.getName());
    }

    @Test
    public void canSetName() {
        Herrerasaurus.setName("Steve The Dino");
        assertEquals("Steve The Dino", Herrerasaurus.getName());
    }

    @Test
    public void hasTreatLevel() {
        assertEquals(TheatLevel.MEDIUM,Triceratops.getTheatLevel());
    }

    @Test
    public void canSetThreatLevel() {
        Triceratops.setTheatLevel(TheatLevel.HIGHT);
        assertEquals(TheatLevel.HIGHT,Triceratops.getTheatLevel());
    }

    @Test
    public void hasDiet() {
        assertEquals(DinoDiet.HERBIVORE,Triceratops.getDiet());
    }
}
