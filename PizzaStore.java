package pizza;

public class PizzaStore {

    public static void main(String[] args) {
        PizzaFactory pf = new PizzaFactory();

        PizzaInterface myCheese = pf.makePizza("Cheese");
        myCheese.prepare();
        myCheese.bake();
        myCheese.cut();
        myCheese.box();

        PizzaInterface myPepperoni = pf.makePizza("Pepperoni");
        myPepperoni.prepare();
        myPepperoni.bake();
        myPepperoni.cut();
        myPepperoni.box();

        PizzaInterface myGreek = pf.makePizza("Greek");
        myGreek.prepare();
        myGreek.bake();
        myGreek.cut();
        myGreek.box();

        PizzaInterface myGlutenFree = pf.makePizza("GlutenFree");
        myGlutenFree.prepare();
        myGlutenFree.bake();
        myGlutenFree.cut();
        myGlutenFree.box();

        PizzaInterface grossPizza = pf.makePizza("Anchovie");
        if (grossPizza != null) {
            grossPizza.prepare();
            grossPizza.bake();
            grossPizza.cut();
            grossPizza.box();
        }
    }
}