package pizza;

public class PizzaFactory {

    public PizzaInterface makePizza(String type) {
        if (type == null || type.isEmpty()) {
            System.err.println("No such pizza type exists");
            return null;
        }

        switch(type) {
            case "Cheese":
                return new CheesePizza();
            case "Greek":
                return new GreekPizza();
            case "Pepperoni":
                return new PepperoniPizza();
            case "GlutenFree":
                return new GlutenFreePizza();        
            default:
                System.err.println("Unknown pizza type");
                return null;
        }
    }
}