package problemaTwo.payment;

public class PaymentAdapter implements PaymentProvider {
    private NewPaymentSystem newPaymentSystem;

    public PaymentAdapter(NewPaymentSystem newPaymentSystem) {
        this.newPaymentSystem = newPaymentSystem;
    }

    @Override
    public void processPayment() {
        newPaymentSystem.newProcessPayment();
    }
}
