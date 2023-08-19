package problemaTwo.payment;

public class ExistingPaymentProvider implements PaymentProvider {
    @Override
    public void processPayment() {
        // Implementación del sistema de pago existente
        System.out.println("Procesando pago con el sistema de pago existente...");
    }
}
