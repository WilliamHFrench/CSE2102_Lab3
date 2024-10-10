package pizza;

public class CheesePizza implements PizzaInterface{

@Override


public void prepare(){
    System.out.println("Preparing a cheese Pizza");
}

public void bake(){
    System.out.println("Baking a cheese Pizza");
}

public void cut(){
    System.out.println("Cutting a cheese Pizza");
}

public void box(){
    System.out.println("Boxing a cheese Pizza");
}

}