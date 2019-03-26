import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setup(){
        visitor = new Visitor(23,2000.00);
    }

    @Test
    public void hasAge() {
        assertEquals(23,visitor.getAge());
    }

    @Test
    public void hasCriminalStatus() {
        assertEquals(false,visitor.getStatus());
    }

    @Test
    public void canBeFlagged() {
        visitor.setCriminal(true);
        assertTrue(visitor.getStatus());
    }

    @Test
    public void hasMonies() {
        assertEquals(2000.00,visitor.getMonies(),0.01);
    }

    @Test
    public void canSetMonies() {
        visitor.setMonies(983.33);
        assertEquals(983.33,visitor.getMonies(),0.01);
    }
}
