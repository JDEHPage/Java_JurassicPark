import Park.SouvenirShop;
import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SouvenirShopTest {

    SouvenirShop souvenirShop;
    Visitor visitor;
    
    @Before
    public void setup(){
        souvenirShop = new SouvenirShop(200, 100);
        visitor = new Visitor(16,900.00);
    }

    @Test
    public void hasActionFigure() {
        assertEquals(200,souvenirShop.getActionFiguresStock());
    }

    @Test
    public void canSetActionFigureStock() {
        souvenirShop.setActionFiguresStock(300);
        assertEquals(300,souvenirShop.getActionFiguresStock());
    }

    @Test
    public void canMakeSale() {
        souvenirShop.makesSale(4,visitor);
        assertEquals(500.00,visitor.getMonies(),0.01);
        assertEquals(196,souvenirShop.getActionFiguresStock());
    }
}
