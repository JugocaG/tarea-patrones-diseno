package problemaTwo.processor;

import problemaTwo.payment.PaymentProvider;

public class PaymentProcessor {
    private PaymentProvider paymentProvider;

    public PaymentProcessor(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void processPayment() {
        paymentProvider.processPayment();
    }
}
