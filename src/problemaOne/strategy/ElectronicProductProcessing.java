package problemaOne.strategy;

public class ElectronicProductProcessing implements OrderProcessingStrategy {
    @Override
    public void verifyInventory() {
        // Implementar lógica para verificación de inventario de productos electrónicos
    }

    @Override
    public void generateInvoice() {
        // Implementar lógica para la generación de facturas de productos electrónicos
    }

    @Override
    public void notifyCustomer() {
        // Implementar lógica para notificar al cliente sobre el pedido de productos electrónicos
    }
}