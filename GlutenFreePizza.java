package pizza;

public class GlutenFreePizza implements PizzaInterface{

@Override


public void prepare(){
    System.out.println("Preparing a GlutenFree Pizza");
}

public void bake(){
    System.out.println("Baking a GlutenFree Pizza");
}

public void cut(){
    System.out.println("Cutting a GlutenFree Pizza");
}

public void box(){
    System.out.println("Boxing a GLutenFree Pizza");
}

}