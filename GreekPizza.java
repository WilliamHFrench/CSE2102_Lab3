package pizza;

public class GreekPizza implements PizzaInterface{

@Override


public void prepare(){
    System.out.println("Preparing a Greek Pizza");
}

public void bake(){
    System.out.println("Baking a Greek Pizza");
}

public void cut(){
    System.out.println("Cutting a Greek Pizza");
}

public void box(){
    System.out.println("Boxing a Greek Pizza");
}

}