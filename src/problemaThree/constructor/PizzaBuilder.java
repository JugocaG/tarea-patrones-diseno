package problemaThree.constructor;

import problemaThree.ingrediente.Ingrediente;
import problemaThree.pizza.Pizza;
import problemaThree.pizza.PizzaComponent;

public class PizzaBuilder implements BaseBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void setSize(String size) {
        pizza.addComponent(new Ingrediente(size + " size", 0));
    }

    @Override
    public void setCrust(String crust) {
        pizza.addComponent(new Ingrediente(crust + " crust", 0));
    }

    @Override
    public void addIngredient(String ingredient, double cost) {
        pizza.addComponent(new Ingrediente(ingredient, cost));
    }

    @Override
    public PizzaComponent getPizza() {
        return pizza;
    }
}