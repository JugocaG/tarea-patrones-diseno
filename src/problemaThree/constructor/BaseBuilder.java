package problemaThree.constructor;

import problemaThree.pizza.PizzaComponent;

public interface BaseBuilder {
    void setSize(String size);
    void setCrust(String crust);
    void addIngredient(String ingredient, double cost);
    PizzaComponent getPizza();
}