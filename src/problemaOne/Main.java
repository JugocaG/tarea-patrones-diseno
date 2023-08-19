package problemaOne;

import problemaOne.processor.OrderProcessor;
import problemaOne.strategy.ClothingProductProcessing;
import problemaOne.strategy.ElectronicProductProcessing;
import problemaOne.strategy.FoodProductProcessing;
import problemaOne.strategy.OrderProcessingStrategy;

public class Main {
    public static void main(String[] args) {
        OrderProcessingStrategy electronicProductStrategy = new ElectronicProductProcessing();
        OrderProcessingStrategy clothingProductStrategy = new ClothingProductProcessing();
        OrderProcessingStrategy foodProductStrategy = new FoodProductProcessing();

        OrderProcessor electronicProductOrderProcessor = new OrderProcessor(electronicProductStrategy);
        OrderProcessor clothingProductOrderProcessor = new OrderProcessor(clothingProductStrategy);
        OrderProcessor foodProductOrderProcessor = new OrderProcessor(foodProductStrategy);

        System.out.println("Processing Electronic Product Order:");
        electronicProductOrderProcessor.processOrder();
        System.out.println();

        System.out.println("Processing Clothing Product Order:");
        clothingProductOrderProcessor.processOrder();
        System.out.println();

        System.out.println("Processing Food Product Order:");
        foodProductOrderProcessor.processOrder();
        System.out.println();


    }
}
