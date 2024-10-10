package pizza;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {

    @Test
    public void testMakeCheesePizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.makePizza("Cheese");

        assertNotNull(myPizza);
        assertTrue(myPizza instanceof CheesePizza);
    }

    @Test
    public void testMakeGreekPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.makePizza("Greek");

        assertNotNull(myPizza);
        assertTrue(myPizza instanceof GreekPizza);
    }

    @Test
    public void testMakePepperoniPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.makePizza("Pepperoni");

        assertNotNull(myPizza);
        assertTrue(myPizza instanceof PepperoniPizza);
    }

    @Test
    public void testMakeGlutenFreePizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.makePizza("GlutenFree");

        assertNotNull(myPizza);
        assertTrue(myPizza instanceof GlutenFreePizza);
    }

    @Test
    public void testMakeUnknownPizza() {
        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.makePizza("Unknown");

        assertNull(myPizza);
    }
}