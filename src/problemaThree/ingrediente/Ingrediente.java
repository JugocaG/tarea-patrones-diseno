package problemaThree.ingrediente;

import problemaThree.pizza.PizzaComponent;

public class Ingrediente extends PizzaComponent {
    private String name;
    private double cost;

    public Ingrediente(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return name;
    }
}

