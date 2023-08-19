package problemaThree;

import problemaThree.constructor.BaseBuilder;
import problemaThree.constructor.PizzaBuilder;
import problemaThree.pizza.PizzaComponent;

public class Main {
    public static void main(String[] args) {
        BaseBuilder builder = new PizzaBuilder();
        builder.setSize("Medium");
        builder.setCrust("Thin");
        builder.addIngredient("Cheese", 2.0);
        builder.addIngredient("Pepperoni", 3.0);

        PizzaComponent pizza = builder.getPizza();

        System.out.println("Problema3.Pizza Description: " + pizza.getDescription());
        System.out.println("Problema3.Pizza Cost: $" + pizza.getCost());
    }
}
