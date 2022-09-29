import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcolatriceTest {
    Calcolatrice calcolatrice;

    @Before
    public final void setUp() {
        calcolatrice = new Calcolatrice();
    }

    @Test
    public void TestSomma() {
        assertTrue("somma corretta", calcolatrice.somma(11,1) == 12);
    }

    @Test
    public void TestMoltiplicazione() {
        assertTrue("moltiplicazione corretta", calcolatrice.moltiplicazione(10,2) == 20);
    }
}