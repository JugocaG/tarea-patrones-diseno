package problemaOne.strategy;

public interface OrderProcessingStrategy {
    void verifyInventory();
    void generateInvoice();
    void notifyCustomer();
}
