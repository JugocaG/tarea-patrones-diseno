package problemaTwo;

import problemaTwo.payment.ExistingPaymentProvider;
import problemaTwo.payment.NewPaymentSystem;
import problemaTwo.payment.PaymentAdapter;
import problemaTwo.processor.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        ExistingPaymentProvider existingPaymentProvider = new ExistingPaymentProvider();
        NewPaymentSystem newPaymentSystem = new NewPaymentSystem();
        PaymentAdapter paymentAdapter = new PaymentAdapter(newPaymentSystem);

        PaymentProcessor existingPaymentProcessor = new PaymentProcessor(existingPaymentProvider);
        PaymentProcessor newPaymentProcessor = new PaymentProcessor(paymentAdapter);

        System.out.println("Procesando pago con sistema existente:");
        existingPaymentProcessor.processPayment();

        System.out.println("\nProcesando pago con nuevo sistema de pago:");
        newPaymentProcessor.processPayment();
    }
}
