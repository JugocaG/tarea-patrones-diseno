package problemaOne.processor;

import problemaOne.strategy.OrderProcessingStrategy;

public class OrderProcessor {
    private OrderProcessingStrategy orderProcessingStrategy;

    public OrderProcessor(OrderProcessingStrategy strategy) {
        this.orderProcessingStrategy = strategy;
    }

    public void processOrder() {
        orderProcessingStrategy.verifyInventory();
        orderProcessingStrategy.generateInvoice();
        orderProcessingStrategy.notifyCustomer();
    }
}
