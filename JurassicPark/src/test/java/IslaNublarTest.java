import Park.IslaNublar;
import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IslaNublarTest {

    IslaNublar islaNublar;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;


    @Before
    public void setup(){
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
}
