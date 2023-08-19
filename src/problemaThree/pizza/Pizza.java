package problemaThree.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends PizzaComponent {
    private List<PizzaComponent> components = new ArrayList<>();

    public void addComponent(PizzaComponent component) {
        components.add(component);
    }

    @Override
    public double getCost() {
        double totalCost = 0;
        for (PizzaComponent component : components) {
            totalCost += component.getCost();
        }
        return totalCost;
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Problema3.Pizza (");
        for (int i = 0; i < components.size(); i++) {
            description.append(components.get(i).getDescription());
            if (i < components.size() - 1) {
                description.append(", ");
            }
        }
        description.append(")");
        return description.toString();
    }
}
