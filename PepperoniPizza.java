package pizza;

public class PepperoniPizza implements PizzaInterface{

@Override


public void prepare(){
    System.out.println("Preparing a Pepperoni Pizza");
}

public void bake(){
    System.out.println("Baking a Pepperoni Pizza");
}

public void cut(){
    System.out.println("Cutting a Pepperoni Pizza");
}

public void box(){
    System.out.println("Boxing a Pepperoni Pizza");
}

}