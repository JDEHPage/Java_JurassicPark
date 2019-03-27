import Attractions.Dinosaur;
import Park.*;
import ServicesAndInfo.DinoDiet;
import ServicesAndInfo.TheatLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IslaNublarTest {

    IslaNublar islaNublar;
    HerrerasaurusEnclosure herrerasaurusEnclosure;
    TriceratopsEnclosure triceratopsEnclosure;
    TyrannosaurusRexEnclosure tyrannosaurusRexEnclosure;
    Dinosaur dinosaurH;
    Dinosaur dinosaurT;
    Dinosaur dinosaurTy;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;


    @Before
    public void setup(){

        dinosaurH = new Dinosaur("Herrerasaurus", DinoDiet.CARNIVORE, TheatLevel.HIGHT);
        herrerasaurusEnclosure = new HerrerasaurusEnclosure("Enclosure 10",dinosaurH,10);
        dinosaurT = new Dinosaur("Triceratops", DinoDiet.HERBIVORE, TheatLevel.MEDIUM);
        triceratopsEnclosure = new TriceratopsEnclosure("Enclosure 13",dinosaurT,10);
        dinosaurTy = new Dinosaur("Tyrannosaurus Rex", DinoDiet.CARNIVORE, TheatLevel.DEADLY);
        tyrannosaurusRexEnclosure = new TyrannosaurusRexEnclosure("Enclosure 20",dinosaurTy,16);
        islaNublar = new IslaNublar(500.00);
        visitor1 = new Visitor(23,2000.00);
        visitor2 = new Visitor(7,750.00);
        visitor3 = new Visitor(34,30000);
        visitor4 = new Visitor(31,5000);
        visitor5 = new Visitor(5,700);
        visitor3.setCriminal(true);
        visitor4.setCriminal(true);

    }

    @Test
    public void canPriceForUnderTen() {
        assertEquals(250.00, islaNublar.priceFor(visitor2),0.01);
    }

    @Test
    public void canPriceForAdult() {
        assertEquals(500.00,islaNublar.priceFor(visitor1),0.01);
    }

    @Test
    public void canStopCriminal() {
        assertEquals(false,islaNublar.isAllowedTo(visitor4));
    }

    @Test
    public void canMakeException() {
        assertEquals(true,islaNublar.isAllowedTo(visitor3));
    }

    @Test
    public void canGrantAccess() {
        assertEquals(true,islaNublar.isAllowedTo(visitor1));
    }

    @Test
    public void canDenyAccessBasedOnAge() {
        assertEquals(false, islaNublar.isAllowedTo(visitor5));
    }

    @Test
    public void canAddAttractions() {
        islaNublar.setUpAttraction(herrerasaurusEnclosure);
        islaNublar.setUpAttraction(tyrannosaurusRexEnclosure);
        islaNublar.setUpAttraction(triceratopsEnclosure);
        assertEquals(3,islaNublar.getAttractions().size());
    }
    
}
