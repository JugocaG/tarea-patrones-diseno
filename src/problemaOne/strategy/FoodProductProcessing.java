package problemaOne.strategy;

public class FoodProductProcessing implements OrderProcessingStrategy {
    @Override
    public void verifyInventory() {
        // Implementar lógica para verificación de inventario de productos alimenticios
    }

    @Override
    public void generateInvoice() {
        // Implementar lógica para la generación de facturas de productos alimenticios
    }

    @Override
    public void notifyCustomer() {
        // Implementar lógica para notificar al cliente sobre el pedido de productos alimenticios
    }
}